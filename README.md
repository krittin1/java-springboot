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

- [x] create new buffer should empty
- [x] create new buffer with default size should 10
- [x] write A to buffer should read A
- [x] write A then B to buffer should read A then B
- [x] after write data in every indexes buffer should full
- [x] after set 15 size buffer size should change to 15
- [x] overwrite data in oldest data when write new data but buffer is full


### List of refactor
+ some duplicate statement in condition
+ can use statement instead method
