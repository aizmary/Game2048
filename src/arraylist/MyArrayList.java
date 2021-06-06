package arraylist;

    public class MyArrayList<E> {

        private static final int DEFAULT_CAPASITY = 10;

        private E[] data; // null
        private int size; // 0

        public MyArrayList() {
            data = (E[]) new Object[DEFAULT_CAPASITY];
        }

        public MyArrayList(int capasity) {
            data = (E[]) new Object[capasity];
        }

        public void add(E element) {
            ensureCapaciry();
            data[size] = element;
            size++; // 1
        }

        public void add(int index, E element) {
            checkAdd(index);
            ensureCapaciry();
            for (int i = size; i > index; i--) {
                data[i] = data[i - 1];
            }
            data[index] = element;
            size++;
        }

        public void remove(int index) {
            checkRange(index);
            for (int i = index; i < size - 1; i++) {
                data[i] = data[i + 1];
            }
            size--;
        }

        public void set(int index, E element) {
            checkRange(index);
            ensureCapaciry();
            data[index] = element;
        }

        private void checkAdd(int index) {
            if (index < 0 || index > size) {
                throw new ArrayIndexOutOfBoundsException("for index: " + index + ", size: " + size);
            }
        }

        public E get(int index) {
            checkRange(index);
            return data[index];
        }

        public void checkRange(int index) {
            if (index < 0 || index >= size) {
                throw new ArrayIndexOutOfBoundsException("for index: " + index + ", size: " + size);
            }
        }

        public void trimToSize() {
            E[] buff = (E[]) new Object[size];

            for (int i = 0; i < size; i++) {
                buff[i] = data[i];
            }
            data = buff;
        }

        private void ensureCapaciry() {
            if (data.length == size) {
                E[] buff = (E[]) new Object[data.length * 2 + 1];

                for (int i = 0; i < data.length; i++) {
                    buff[i] = data[i];
                }
                data = buff;
            }
        }

        public int size() {
            return size;
        }

        @Override
        public String toString() {
            StringBuilder listToString = new StringBuilder("[");
            for (int i = 0; i < size; i++) {
                listToString.append(data[i]);
                if (i < size - 1) {
                    listToString.append(", ");
                }
            }
            listToString.append("]");
            return listToString.toString();
        }

    }



