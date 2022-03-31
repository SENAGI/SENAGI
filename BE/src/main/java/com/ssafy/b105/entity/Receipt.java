package com.ssafy.b105.entity;

import com.ssafy.b105.dto.CampaignRequestDto;
import com.ssafy.b105.dto.ReceiptDto;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.ssafy.b105.entity.campaign.Campaign;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@Entity
@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Receipt extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "receipt_id")
    private Long id;

    @NotNull
    @Column(length = 255)
    private String receiptImageUrl;

    @NotNull
    @Column(length = 255)
    private String item;

    @NotNull
    private Long amount;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "campaign_id")
    private Campaign campaign;


    public static Receipt from(ReceiptDto receiptDto) {
        if (receiptDto == null) {
            return null;
        }

        return Receipt.builder()
            .receiptImageUrl(receiptDto.getReceiptImageUrl())
            .amount(receiptDto.getAmount())
            .item(receiptDto.getItem())
//            .txHash(receiptDto.getTxHash())
            .campaign(receiptDto.getCampaign())
            .build();
    }
}