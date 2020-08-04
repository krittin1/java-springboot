public class CircularBuffer {

    private int bufferSize;
    private String[] buffer;
    private int readPointer;
    private int writePointer;

    public CircularBuffer() {
        this(10);
    }

    public CircularBuffer(int size){
        this.bufferSize = size;
        this.buffer = new String[bufferSize];
    }


    public boolean isEmpty() {
        return readPointer == writePointer;
    }

    public void writeData(String input) {
        this.buffer[((writePointer++) % this.buffer.length - 1) - (-1)] = input;
    }

    public boolean isFull() {
        return writePointer >= bufferSize;
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
