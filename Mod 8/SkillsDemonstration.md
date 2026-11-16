# Mod 8: Skills Demonstration

>What are some modern examples of programs being treated as data?

Since programs are also already data, what comes to mind are programs that look at the content of other programs.

- Your antivirus looks at potentially infected files without running the code inside.

- When you download an app from the app store, the server has to send the code to your device in order for it to be ran.

- The Java compiler changes human written code into machine code that the computer can read.

- A virtual machine would read the operating system data in order to simulate another computer.

| binary | hex | TOY instruction |
| :---: | :---: | :---: |
| 0001001000110100 | 1234 | R[2] <- R[3] + R[4] |
| 1111111111111111 | FFFF | R[F] <- PC; PC <- FF |
| 1111101011001110 | FACE | R[A] <- PC; PC <- CE |
| 0101011001000100 | 5644 | R[6] <- R[4] << R[4] |
| 1000000000000001 | 8001 | R[0] <- M[01] |
| 0101000001000011 | 5043 | R[0] <- R[4] << R[3] |
| 0001110010101011 | 1CAB | R[C] <- R[A] + R[B] |
| 0011111111111111 | 3FFF | R[F] <- R[F] & R[F] |
| 1000100010001000 | 8888 | R[8] <- M[88] |
| 0111011101110111 | 7777 | R[7] <- 77 (the number itself) |
| 1100110011001100 | CCCC | if (R[C] == 0) PC <- CC|
