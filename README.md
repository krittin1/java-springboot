# java-springboot

## Circular buffer

### 1. Data structure ? (Internal)
+ Array of String

### 2. Operations/Behavior/Methods ? user -> CB ?
+ writeData(string):void

+ readData(): string

+ isFull(): boolean

+ isEmpty(): boolean

+ setSize(int): void

### 3. Internal process ?
+ buffer size = 10 (default)
+ read pointer = 0
+ write pointer = 0

### List of test cases
+ create new buffer should empty
+ create new buffer with default size should 10
+ write A to buffer should read A
+ after write data in every indexes buffer should full
