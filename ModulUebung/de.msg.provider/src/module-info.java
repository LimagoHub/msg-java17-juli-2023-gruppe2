import de.msg.provider.StringSupplier;
import de.msg.provider.internal.StringSupplierImpl;

module de.msg.provider {

    exports de.msg.provider;

    provides StringSupplier with StringSupplierImpl;
    uses StringSupplier;
}