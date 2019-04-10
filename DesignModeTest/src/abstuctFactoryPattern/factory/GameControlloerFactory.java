package abstuctFactoryPattern.factory;

import abstuctFactoryPattern.product.InterfaceController;
import abstuctFactoryPattern.product.OperationController;

public abstract class GameControlloerFactory{
    public abstract InterfaceController createInterface();
    public abstract OperationController createOperation();
}
