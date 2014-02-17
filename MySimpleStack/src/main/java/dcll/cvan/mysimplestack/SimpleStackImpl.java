package dcll.cvan.mysimplestack;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class SimpleStackImpl implements SimpleStack {
    private List<Item> internal = new ArrayList<Item>();

    @Override
    public boolean isEmpty() {
        return internal.isEmpty();
    }

    @Override
    public int getSize() {
        return internal.size();
    }

    @Override
    public void push(Item item) {
        internal.add(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return internal.get(getSize() - 1);
    }

    @Override
    public Item pop() throws EmptyStackException {
        Item tmp = peek();
        internal.remove(getSize() - 1);
        return tmp;
    }

}
