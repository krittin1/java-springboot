public class CircularBuffer {

    private int bufferSize = 10;
    private String[] buffer;
    private int readPointer;
    private int writePointer;

    public CircularBuffer() {
        this.buffer = new String[10];
    }

    public boolean isEmpty() {
        return bufferSize == 10;
    }

    public void writeData(String input) {
        if (!isFull())
            bufferSize--;
        this.buffer[((writePointer++) % 10 - 1) - (-1)] = input;
    }

    public boolean isFull() {
        return bufferSize == 0;
    }

    public String readData() {
        return this.buffer[((readPointer++) % 10 - 1) - (-1)];
    }

    public String[] getBuffer() {
        return buffer;
    }

    public void setSize(int size) {
        this.buffer = new String[size];
    }
}
