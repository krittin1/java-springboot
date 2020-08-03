public class CircularBuffer {

    private int bufferSize = 10;
    private String[] buffer;
    private int readPointer;
    private int writePointer;

    public CircularBuffer() {
        this.buffer = new String[10];
    }

    public boolean isEmpty() {
        return bufferSize == this.buffer.length;
    }

    public void writeData(String input) {
        if (!isFull())
            bufferSize--;
        this.buffer[((writePointer++) % this.buffer.length - 1) - (-1)] = input;
    }

    public boolean isFull() {
        return bufferSize == 0;
    }

    public String readData() {
        return this.buffer[((readPointer++) % this.buffer.length - 1) - (-1)];
    }

    public String[] getBuffer() {
        return buffer;
    }

    public void setSize(int size) {
        this.buffer = new String[size];
        this.bufferSize = size;
    }
}
