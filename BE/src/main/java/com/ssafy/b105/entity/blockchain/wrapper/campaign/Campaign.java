package com.ssafy.b105.entity.blockchain.wrapper.campaign;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.web3j.abi.EventEncoder;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.Event;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameter;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.request.EthFilter;
import org.web3j.protocol.core.methods.response.BaseEventResponse;
import org.web3j.protocol.core.methods.response.Log;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.8.8.
 */
@SuppressWarnings("rawtypes")
public class Campaign extends Contract {
    public static final String BINARY = "608060405234801561001057600080fd5b50604051610f3c380380610f3c8339818101604052608081101561003357600080fd5b508051602082015160408301516060909301519192909161006c61005e6401000000006100b0810204565b6401000000006100b4810204565b60018054600160a060020a03938416600160a060020a031991821617909155600280549290931691161790556003919091556004556005805460ff19169055610104565b3390565b60008054600160a060020a03838116600160a060020a0319831681178455604051919092169283917f8be0079c531659141344cd1fd0a4f28419497f9722a3daafe3b4186f6b6457e09190a35050565b610e29806101136000396000f3fe608060405234801561001057600080fd5b50600436106100b0576000357c010000000000000000000000000000000000000000000000000000000090048063a4fd6f5611610083578063a4fd6f561461013d578063bef3a08314610145578063c74073a11461014d578063e69d849d14610173578063f2fde38b1461019f576100b0565b80635a6b26ba146100b5578063715018a6146100f55780638da5cb5b146100ff578063953b8fb814610123575b600080fd5b6100e1600480360360408110156100cb57600080fd5b50600160a060020a0381351690602001356101c5565b604080519115158252519081900360200190f35b6100fd610486565b005b6101076104f7565b60408051600160a060020a039092168252519081900360200190f35b61012b610507565b60408051918252519081900360200190f35b6100e161050d565b61012b610516565b6100fd6004803603602081101561016357600080fd5b5035600160a060020a031661051c565b6100e16004803603604081101561018957600080fd5b50600160a060020a0381351690602001356107e3565b6100fd600480360360208110156101b557600080fd5b5035600160a060020a0316610ac1565b60006101cf610b7a565b600160a060020a03166101e06104f7565b600160a060020a03161461022c576040805160e560020a62461bcd0281526020600482018190526024820152600080516020610d15833981519152604482015290519081900360640190fd5b610234610b7e565b156102735760405160e560020a62461bcd02815260040180806020018281038252602a815260200180610dca602a913960400191505060405180910390fd5b600154604080517f61b3ad8f000000000000000000000000000000000000000000000000000000008152600160a060020a038681166004830152915191909216916361b3ad8f916024808301926020929190829003018186803b1580156102d957600080fd5b505afa1580156102ed573d6000803e3d6000fd5b505050506040513d602081101561030357600080fd5b50516103435760405160e560020a62461bcd028152600401808060200182810382526030815260200180610d9a6030913960400191505060405180910390fd5b600254604080517f095ea7b3000000000000000000000000000000000000000000000000000000008152306004820152602481018590529051600160a060020a039092169163095ea7b3916044808201926020929091908290030181600087803b1580156103b057600080fd5b505af11580156103c4573d6000803e3d6000fd5b505050506040513d60208110156103da57600080fd5b5050600254604080517f23b872dd000000000000000000000000000000000000000000000000000000008152306004820152600160a060020a03868116602483015260448201869052915191909216916323b872dd9160648083019260209291908290030181600087803b15801561045157600080fd5b505af1158015610465573d6000803e3d6000fd5b505050506040513d602081101561047b57600080fd5b506001949350505050565b61048e610b7a565b600160a060020a031661049f6104f7565b600160a060020a0316146104eb576040805160e560020a62461bcd0281526020600482018190526024820152600080516020610d15833981519152604482015290519081900360640190fd5b6104f56000610bd3565b565b600054600160a060020a03165b90565b60035490565b60055460ff1690565b60045490565b610524610b7a565b600160a060020a03166105356104f7565b600160a060020a031614610581576040805160e560020a62461bcd0281526020600482018190526024820152600080516020610d15833981519152604482015290519081900360640190fd5b610589610b7e565b156105c85760405160e560020a62461bcd02815260040180806020018281038252602a815260200180610dca602a913960400191505060405180910390fd5b600154604080517f355415d1000000000000000000000000000000000000000000000000000000008152600160a060020a0384811660048301529151919092169163355415d1916024808301926020929190829003018186803b15801561062e57600080fd5b505afa158015610642573d6000803e3d6000fd5b505050506040513d602081101561065857600080fd5b50516106985760405160e560020a62461bcd02815260040180806020018281038252603b815260200180610d5f603b913960400191505060405180910390fd5b60006106a2610c30565b600254604080517f095ea7b3000000000000000000000000000000000000000000000000000000008152306004820152602481018490529051929350600160a060020a039091169163095ea7b3916044808201926020929091908290030181600087803b15801561071257600080fd5b505af1158015610726573d6000803e3d6000fd5b505050506040513d602081101561073c57600080fd5b5050600254604080517f23b872dd000000000000000000000000000000000000000000000000000000008152306004820152600160a060020a03858116602483015260448201859052915191909216916323b872dd9160648083019260209291908290030181600087803b1580156107b357600080fd5b505af11580156107c7573d6000803e3d6000fd5b505050506040513d60208110156107dd57600080fd5b50505050565b60006107ed610b7a565b600160a060020a03166107fe6104f7565b600160a060020a03161461084a576040805160e560020a62461bcd0281526020600482018190526024820152600080516020610d15833981519152604482015290519081900360640190fd5b610852610b7e565b6108905760405160e560020a62461bcd028152600401808060200182810382526029815260200180610cec6029913960400191505060405180910390fd5b600154604080517fb9cccee3000000000000000000000000000000000000000000000000000000008152600160a060020a0386811660048301529151919092169163b9cccee3916024808301926020929190829003018186803b1580156108f657600080fd5b505afa15801561090a573d6000803e3d6000fd5b505050506040513d602081101561092057600080fd5b50516109605760405160e560020a62461bcd02815260040180806020018281038252602a815260200180610d35602a913960400191505060405180910390fd5b600061096a610c30565b60035403905080831061097b578092505b600254604080517f095ea7b3000000000000000000000000000000000000000000000000000000008152600160a060020a038781166004830152602482018790529151919092169163095ea7b39160448083019260209291908290030181600087803b1580156109ea57600080fd5b505af11580156109fe573d6000803e3d6000fd5b505050506040513d6020811015610a1457600080fd5b5050600254604080517f23b872dd000000000000000000000000000000000000000000000000000000008152600160a060020a03878116600483015230602483015260448201879052915191909216916323b872dd9160648083019260209291908290030181600087803b158015610a8b57600080fd5b505af1158015610a9f573d6000803e3d6000fd5b505050506040513d6020811015610ab557600080fd5b50600195945050505050565b610ac9610b7a565b600160a060020a0316610ada6104f7565b600160a060020a031614610b26576040805160e560020a62461bcd0281526020600482018190526024820152600080516020610d15833981519152604482015290519081900360640190fd5b600160a060020a038116610b6e5760405160e560020a62461bcd028152600401808060200182810382526026815260200180610cc66026913960400191505060405180910390fd5b610b7781610bd3565b50565b3390565b60055460009060ff16151560011415610b9957506000610504565b610ba1610c30565b600354111580610bb357504260045411155b15610bcd57506005805460ff191660011790556000610504565b50600190565b60008054600160a060020a0383811673ffffffffffffffffffffffffffffffffffffffff19831681178455604051919092169283917f8be0079c531659141344cd1fd0a4f28419497f9722a3daafe3b4186f6b6457e09190a35050565b600254604080517f70a082310000000000000000000000000000000000000000000000000000000081523060048201529051600092600160a060020a0316916370a08231916024808301926020929190829003018186803b158015610c9457600080fd5b505afa158015610ca8573d6000803e3d6000fd5b505050506040513d6020811015610cbe57600080fd5b505190509056fe4f776e61626c653a206e6577206f776e657220697320746865207a65726f206164647265737343616d706169676e4572726f72203a20546869732063616d706169676e20616c726561647920656e644f776e61626c653a2063616c6c6572206973206e6f7420746865206f776e657243616d706169676e4572726f72203a204f6e6c7920737570706f72746572732063616e20646f6e61746543616d706169676e206572726f72203a2044657374206163636f756e74206f6e6c79207368656c7465722063616d706169676e206163636f756e7443616d706169676e4572726f72203a204f6e6c79207368656c746572732063616e207769746864726177206d6f6e657943616d706169676e206572726f72203a20546869732063616d706169676e206e6f742079657420656e64a26469706673582212204c1b682abd488802a71c51694ee8425229b5dd2c80738da57223b8f9b207c76164736f6c63430007010033";

    public static final String FUNC_CLOSE = "close";

    public static final String FUNC_DEADLINE = "deadLine";

    public static final String FUNC_DONATE = "donate";

    public static final String FUNC_ISENDED = "isEnded";

    public static final String FUNC_OWNER = "owner";

    public static final String FUNC_RENOUNCEOWNERSHIP = "renounceOwnership";

    public static final String FUNC_TARGETAMOUNT = "targetAmount";

    public static final String FUNC_TRANSFEROWNERSHIP = "transferOwnership";

    public static final String FUNC_WITHDRAWAL = "withdrawal";

    public static final Event OWNERSHIPTRANSFERRED_EVENT = new Event("OwnershipTransferred", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}, new TypeReference<Address>(true) {}));
    ;

    @Deprecated
    protected Campaign(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Campaign(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected Campaign(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected Campaign(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public List<OwnershipTransferredEventResponse> getOwnershipTransferredEvents(TransactionReceipt transactionReceipt) {
        List<EventValuesWithLog> valueList = extractEventParametersWithLog(OWNERSHIPTRANSFERRED_EVENT, transactionReceipt);
        ArrayList<OwnershipTransferredEventResponse> responses = new ArrayList<OwnershipTransferredEventResponse>(valueList.size());
        for (EventValuesWithLog eventValues : valueList) {
            OwnershipTransferredEventResponse typedResponse = new OwnershipTransferredEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.previousOwner = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.newOwner = (String) eventValues.getIndexedValues().get(1).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<OwnershipTransferredEventResponse> ownershipTransferredEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, OwnershipTransferredEventResponse>() {
            @Override
            public OwnershipTransferredEventResponse apply(Log log) {
                EventValuesWithLog eventValues = extractEventParametersWithLog(OWNERSHIPTRANSFERRED_EVENT, log);
                OwnershipTransferredEventResponse typedResponse = new OwnershipTransferredEventResponse();
                typedResponse.log = log;
                typedResponse.previousOwner = (String) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.newOwner = (String) eventValues.getIndexedValues().get(1).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<OwnershipTransferredEventResponse> ownershipTransferredEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(OWNERSHIPTRANSFERRED_EVENT));
        return ownershipTransferredEventFlowable(filter);
    }

    public RemoteFunctionCall<TransactionReceipt> close(String to) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_CLOSE, 
                Arrays.<Type>asList(new Address(160, to)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<BigInteger> deadLine() {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_DEADLINE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<TransactionReceipt> donate(String from, BigInteger amount) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_DONATE, 
                Arrays.<Type>asList(new Address(160, from),
                new Uint256(amount)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<Boolean> isEnded() {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_ISENDED, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteFunctionCall<String> owner() {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_OWNER, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<TransactionReceipt> renounceOwnership() {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_RENOUNCEOWNERSHIP, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<BigInteger> targetAmount() {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_TARGETAMOUNT, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<TransactionReceipt> transferOwnership(String newOwner) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_TRANSFEROWNERSHIP, 
                Arrays.<Type>asList(new Address(160, newOwner)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> withdrawal(String to, BigInteger amount) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_WITHDRAWAL, 
                Arrays.<Type>asList(new Address(160, to),
                new Uint256(amount)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static Campaign load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Campaign(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static Campaign load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Campaign(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static Campaign load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new Campaign(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Campaign load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Campaign(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<Campaign> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider, BigInteger targetAmount_, BigInteger deadLine_, String member_, String token_) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new Uint256(targetAmount_),
                new Uint256(deadLine_),
                new Address(160, member_),
                new Address(160, token_)));
        return deployRemoteCall(Campaign.class, web3j, credentials, contractGasProvider, BINARY, encodedConstructor);
    }

    public static RemoteCall<Campaign> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider, BigInteger targetAmount_, BigInteger deadLine_, String member_, String token_) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new Uint256(targetAmount_),
                new Uint256(deadLine_),
                new Address(160, member_),
                new Address(160, token_)));
        return deployRemoteCall(Campaign.class, web3j, transactionManager, contractGasProvider, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<Campaign> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger targetAmount_, BigInteger deadLine_, String member_, String token_) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new Uint256(targetAmount_),
                new Uint256(deadLine_),
                new Address(160, member_),
                new Address(160, token_)));
        return deployRemoteCall(Campaign.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<Campaign> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, BigInteger targetAmount_, BigInteger deadLine_, String member_, String token_) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new Uint256(targetAmount_),
                new Uint256(deadLine_),
                new Address(160, member_),
                new Address(160, token_)));
        return deployRemoteCall(Campaign.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static class OwnershipTransferredEventResponse extends BaseEventResponse {
        public String previousOwner;

        public String newOwner;
    }
}