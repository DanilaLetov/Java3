package Task_1;

public class OnlinePurchase {
    public void makePurchase(String fullName, String INN) throws InvalidINNException {
        validateINN(INN);
    }

    public void validateINN(String INN) throws InvalidINNException {
        if (!isValidINN(INN)) {
            throw new InvalidINNException("Invalid INN: " + INN);
        }
    }

    private boolean isValidINN(String INN) {
        if (!INN.matches("\\d+")) {
            return false;
        }
        if (INN.length() != 10) {
            return false;
        }
        return true;
    }
}

