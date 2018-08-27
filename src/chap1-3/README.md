# 1.3 背包、队列和栈
[Bags, Queues, and Stacks](https://algs4.cs.princeton.edu/13stacks/)

## `FixedCapacityStackOfStrings.java`
由于 powershell 不支持 `<` 操作符进行标准读入，因此在 wsl 中进行测试。
```bash
java -cp '~/algs4.jar:' FixedCapacityStackOfStrings < tobe.txt
```
[^1]

[^1]: `~/algs4.jar` 为本地 algs4.jar 路径

## `FixedCapacityStack.java`
由于书中示例代码使用了类型转换，因此，应使用 `javac FixedCapacityStack -Xlint:unchecked` 进行编译。同时 javac 编译器会抛出警告，可以忽略。
测试方法同上，需在 wsl 进行。

## Ex 1.3.2
输出结果为 `it`。