package com.bitlogger.web3resume;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
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
 * <p>Generated with web3j version 1.4.1.
 */
@SuppressWarnings("rawtypes")
public class Institutes extends Contract {
    public static final String BINARY = "608060405234801561001057600080fd5b50336000806101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff160217905550610a12806100606000396000f3fe608060405234801561001057600080fd5b506004361061004c5760003560e01c80638f8e94c914610051578063a673dd4b1461006d578063aac132de1461009d578063fefb21a4146100cd575b600080fd5b61006b600480360381019061006691906104dd565b6100eb565b005b61008760048036038101906100829190610568565b610248565b60405161009491906105b0565b60405180910390f35b6100b760048036038101906100b29190610568565b6102b2565b6040516100c491906105b0565b60405180910390f35b6100d561031b565b6040516100e291906105e4565b60405180910390f35b3373ffffffffffffffffffffffffffffffffffffffff1660008054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1614610179576040517f08c379a00000000000000000000000000000000000000000000000000000000081526004016101709061065c565b60405180910390fd5b6000604051806060016040528085815260200184815260200160011515815250905080600260008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060008201518160000190816101f09190610893565b5060208201518160010190816102069190610893565b5060408201518160020160006101000a81548160ff0219169083151502179055509050506001600081548092919061023d90610994565b919050555050505050565b6000600260008373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060020160009054906101000a900460ff16156102a857600190506102ad565b600090505b919050565b60008060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168273ffffffffffffffffffffffffffffffffffffffff16036103115760019050610316565b600090505b919050565b6000600154905090565b6000604051905090565b600080fd5b600080fd5b600080fd5b600080fd5b6000601f19601f8301169050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052604160045260246000fd5b61038c82610343565b810181811067ffffffffffffffff821117156103ab576103aa610354565b5b80604052505050565b60006103be610325565b90506103ca8282610383565b919050565b600067ffffffffffffffff8211156103ea576103e9610354565b5b6103f382610343565b9050602081019050919050565b82818337600083830152505050565b600061042261041d846103cf565b6103b4565b90508281526020810184848401111561043e5761043d61033e565b5b610449848285610400565b509392505050565b600082601f83011261046657610465610339565b5b813561047684826020860161040f565b91505092915050565b600073ffffffffffffffffffffffffffffffffffffffff82169050919050565b60006104aa8261047f565b9050919050565b6104ba8161049f565b81146104c557600080fd5b50565b6000813590506104d7816104b1565b92915050565b6000806000606084860312156104f6576104f561032f565b5b600084013567ffffffffffffffff81111561051457610513610334565b5b61052086828701610451565b935050602084013567ffffffffffffffff81111561054157610540610334565b5b61054d86828701610451565b925050604061055e868287016104c8565b9150509250925092565b60006020828403121561057e5761057d61032f565b5b600061058c848285016104c8565b91505092915050565b60008115159050919050565b6105aa81610595565b82525050565b60006020820190506105c560008301846105a1565b92915050565b6000819050919050565b6105de816105cb565b82525050565b60006020820190506105f960008301846105d5565b92915050565b600082825260208201905092915050565b7f4e6f2073756666696369656e7420726967687400000000000000000000000000600082015250565b60006106466013836105ff565b915061065182610610565b602082019050919050565b6000602082019050818103600083015261067581610639565b9050919050565b600081519050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602260045260246000fd5b600060028204905060018216806106ce57607f821691505b6020821081036106e1576106e0610687565b5b50919050565b60008190508160005260206000209050919050565b60006020601f8301049050919050565b600082821b905092915050565b6000600883026107497fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff8261070c565b610753868361070c565b95508019841693508086168417925050509392505050565b6000819050919050565b600061079061078b610786846105cb565b61076b565b6105cb565b9050919050565b6000819050919050565b6107aa83610775565b6107be6107b682610797565b848454610719565b825550505050565b600090565b6107d36107c6565b6107de8184846107a1565b505050565b5b81811015610802576107f76000826107cb565b6001810190506107e4565b5050565b601f82111561084757610818816106e7565b610821846106fc565b81016020851015610830578190505b61084461083c856106fc565b8301826107e3565b50505b505050565b600082821c905092915050565b600061086a6000198460080261084c565b1980831691505092915050565b60006108838383610859565b9150826002028217905092915050565b61089c8261067c565b67ffffffffffffffff8111156108b5576108b4610354565b5b6108bf82546106b6565b6108ca828285610806565b600060209050601f8311600181146108fd57600084156108eb578287015190505b6108f58582610877565b86555061095d565b601f19841661090b866106e7565b60005b828110156109335784890151825560018201915060208501945060208101905061090e565b86831015610950578489015161094c601f891682610859565b8355505b6001600288020188555050505b505050505050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601160045260246000fd5b600061099f826105cb565b91507fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff82036109d1576109d0610965565b5b60018201905091905056fea264697066735822122009e450827cc1c0dc822d6ebfbfd96ada61e8be713456adb7670bcd6398224a7b64736f6c63430008110033";

    public static final String FUNC_ADDINSTITUTE = "addInstitute";

    public static final String FUNC_INSTITUTECOUNT = "instituteCount";

    public static final String FUNC_IS_ADMIN = "is_admin";

    public static final String FUNC_IS_INSTITUTE = "is_institute";

    @Deprecated
    protected Institutes(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Institutes(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected Institutes(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected Institutes(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<TransactionReceipt> addInstitute(String name, String description, String institute_adress) {
        final Function function = new Function(
                FUNC_ADDINSTITUTE,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(name),
                        new org.web3j.abi.datatypes.Utf8String(description),
                        new org.web3j.abi.datatypes.Address(160, institute_adress)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<BigInteger> instituteCount() {
        final Function function = new Function(FUNC_INSTITUTECOUNT,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<Boolean> is_admin(String _admin) {
        final Function function = new Function(FUNC_IS_ADMIN,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _admin)),
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteFunctionCall<Boolean> is_institute(String _institute) {
        final Function function = new Function(FUNC_IS_INSTITUTE,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _institute)),
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    @Deprecated
    public static Institutes load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Institutes(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static Institutes load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Institutes(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static Institutes load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new Institutes(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Institutes load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Institutes(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<Institutes> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Institutes.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    public static RemoteCall<Institutes> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Institutes.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Institutes> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Institutes.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Institutes> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Institutes.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }
}
