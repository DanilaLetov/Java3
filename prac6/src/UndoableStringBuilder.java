import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class UndoableStringBuilder {
    private StringBuilder stringBuilder;
    private List<Supplier<StringBuilder>> undoActions;

    public UndoableStringBuilder() {
        stringBuilder = new StringBuilder();
        undoActions = new ArrayList<>();
    }

    public UndoableStringBuilder(String str) {
        stringBuilder = new StringBuilder(str);
        undoActions = new ArrayList<>();
    }

    public UndoableStringBuilder append(String str) {
        stringBuilder.append(str);
        undoActions.add(() -> stringBuilder.delete(stringBuilder.length() - str.length(), stringBuilder.length()));
        return this;
    }

    public UndoableStringBuilder delete(int start, int end) {
        String deletedStr = stringBuilder.substring(start, end);
        stringBuilder.delete(start, end);
        undoActions.add(() -> stringBuilder.insert(start, deletedStr));
        return this;
    }

    public UndoableStringBuilder insert(int offset, String str) {
        stringBuilder.insert(offset, str);
        undoActions.add(() -> stringBuilder.delete(offset, offset + str.length()));
        return this;
    }

    public UndoableStringBuilder replace(int start, int end, String str) {
        String replacedStr = stringBuilder.substring(start, end);
        stringBuilder.replace(start, end, str);
        undoActions.add(() -> stringBuilder.replace(start, start + str.length(), replacedStr));
        return this;
    }

    public UndoableStringBuilder reverse() {
        stringBuilder.reverse();
        undoActions.add(() -> stringBuilder.reverse());
        return this;
    }

    public void undo() {
        if (!undoActions.isEmpty()) {
            var lastAction = undoActions.remove(undoActions.size() - 1);
            lastAction.get();
        }
    }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }
}