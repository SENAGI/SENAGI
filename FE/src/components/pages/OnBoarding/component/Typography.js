import PropTypes from "prop-types";

import { withStyles } from "@mui/styles";
import MuiTypography from "@mui/material/Typography";

const markStyleMapping = {
  center: {
    h1: "",
    h2: "markedH2Center",
    h3: "markedH3Center",
    h4: "markedH4Center",
    h5: "",
    h6: "",
  },
  left: {
    h1: "",
    h2: "",
    h3: "",
    h4: "",
    h5: "",
    h6: "markedH6Left",
  },
  none: {
    h1: "",
    h2: "",
    h3: "",
    h4: "",
    h5: "",
    h6: "",
  },
};

const styles = (theme) => ({
  [markStyleMapping.center.h2]: {
    height: 4,
    width: 73,
    display: "block",
    margin: `${theme.spacing(1)} auto 0`,
    backgroundColor: "#e65100",
  },
  [markStyleMapping.center.h3]: {
    height: 4,
    width: 55,
    display: "block",
    margin: `${theme.spacing(1)} auto 0`,
    backgroundColor: "#e65100",
  },
  [markStyleMapping.center.h4]: {
    height: 4,
    width: 55,
    display: "block",
    margin: `${theme.spacing(1)} auto 0`,
    backgroundColor: "#e65100",
  },
  [markStyleMapping.left.h6]: {
    height: 2,
    width: 28,
    display: "block",
    marginTop: theme.spacing(0.5),
    background: "currentColor",
  },
});

const variantMapping = {
  h1: "h1",
  h2: "h1",
  h3: "h1",
  h4: "h1",
  h5: "h3",
  h6: "h2",
  subtitle1: "h3",
};

function Typography(props) {
  const { children, variant, classes, marked = "none", ...other } = props;

  let markedClassName = "";
  if (variant && variant in markStyleMapping[marked]) {
    markedClassName = classes[markStyleMapping[marked][variant]];
  }

  return (
    <MuiTypography variantMapping={variantMapping} variant={variant} {...other}>
      {children}
      {markedClassName ? <span className={markedClassName} /> : null}
    </MuiTypography>
  );
}

Typography.propTypes = {
  children: PropTypes.node,

  classes: PropTypes.object.isRequired,
  marked: PropTypes.oneOf(["center", "left", "none"]),
  variant: PropTypes.oneOf([
    "body1",
    "body2",
    "button",
    "caption",
    "h1",
    "h2",
    "h3",
    "h4",
    "h5",
    "h6",
    "inherit",
    "overline",
    "subtitle1",
    "subtitle2",
  ]),
};

export default withStyles(styles)(Typography);
