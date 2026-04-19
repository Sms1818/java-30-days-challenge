# ***File Handling in Java***

---

# 🔥 **What is File Handling?**

---

## **Definition**

File Handling in Java is the process of **creating, reading, writing, updating, and deleting data stored in files on secondary storage (disk)**.

> It allows programs to persist data beyond program execution 

---

# 🧠 **Core Idea**

```text id="fh1"
File = Permanent storage  
Stream = Data flow between program and file
```

---

# 🔥 **Why File Handling?**

---

✔ Store data permanently
✔ Read large datasets
✔ Logging and configuration
✔ Real-world applications (DB alternative for small systems)

---

---

# 🔥 **Types of Files**

---

## 🔹 **1. Text Files**

👉 Store data in readable format

Example:

```text
Hello World
12345
```

---

## 🔹 **2. Binary Files**

👉 Store data in byte format (not readable)

---

---

# 🔥 **Core Operations (MOST IMPORTANT)**

---

```text id="fh2"
1. Create file  
2. Write to file  
3. Read from file  
4. Update file  
5. Delete file
```

---

---

# 🔥 **Key Classes (Essential Only)**

---

| Class            | Purpose             |
| ---------------- | ------------------- |
| File             | Represents file     |
| FileReader       | Reads text          |
| BufferedReader   | Fast reading        |
| FileWriter       | Writes text         |
| BufferedWriter   | Fast writing        |
| PrintWriter      | Formatted writing   |
| RandomAccessFile | Read/write anywhere |

---

---

# 🔥 **1. File Class**

---

## **Definition**

The `File` class represents a file or directory path in the system.

---

## **Important Methods**

---

| Method          | Description      |
| --------------- | ---------------- |
| createNewFile() | Creates file     |
| exists()        | Checks existence |
| delete()        | Deletes file     |
| getName()       | File name        |
| length()        | File size        |

---

## **Example**

```java id="fh3"
import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {

        File file = new File("data.txt");

        if (file.createNewFile()) {
            System.out.println("File created");
        } else {
            System.out.println("File already exists");
        }
    }
}
```

---

---

# 🔥 **2. Writing to File**

---

## **Using FileWriter**

---

### **Definition**

`FileWriter` is used to write character data into a file.

---

### **Example**

```java id="fh4"
import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {

        FileWriter writer = new FileWriter("data.txt");

        writer.write("Hello Java File Handling");
        writer.close();
    }
}
```

---

---

## 🔹 **Using BufferedWriter (Better Performance)**

---

### **Why?**

```text id="fh5"
Writes data in chunks → faster than FileWriter
```

---

### **Example**

```java id="fh6"
import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"));

        bw.write("Line 1");
        bw.newLine();
        bw.write("Line 2");

        bw.close();
    }
}
```

---

---

# 🔥 **3. Reading from File**

---

## **Using FileReader + BufferedReader**

---

### **Definition**

* `FileReader` → reads characters
* `BufferedReader` → improves performance

---

### **Example**

```java id="fh7"
import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("data.txt"));

        String line;

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}
```

---

---

# 🔥 **4. Append Data to File**

---

```java id="fh8"
FileWriter writer = new FileWriter("data.txt", true);
writer.write("\nNew Line Added");
writer.close();
```

---

👉 `true` enables append mode

---

---

# 🔥 **5. RandomAccessFile**

---

## **Definition**

Allows reading and writing **at any position in the file using file pointer**.

---

## 🧠 **Key Concept**

```text id="fh9"
File Pointer → current position in file
```

---

## **Important Methods**

---

| Method           | Description      |
| ---------------- | ---------------- |
| readLine()       | Reads line       |
| writeBytes()     | Writes data      |
| seek(pos)        | Move pointer     |
| getFilePointer() | Current position |
| length()         | File size        |

---

---

## **Example**

```java id="fh10"
import java.io.*;

public class Test {
    public static void main(String[] args) throws Exception {

        RandomAccessFile raf = new RandomAccessFile("data.txt", "rw");

        raf.writeBytes("Hello\nWorld");

        raf.seek(0); // go to beginning

        System.out.println(raf.readLine());

        raf.close();
    }
}
```

---

---

# 🔥 **CRUD Operations**

---

## 🧠 Flow from your content:

```text id="fh11"
Read → Check → Modify → Rewrite file
```

---

👉 Used in real applications

---

---

# 🔥 **Delete File**

---

```java id="fh12"
File file = new File("data.txt");

if (file.delete()) {
    System.out.println("Deleted successfully");
}
```

---

---

# 🔥 **Important Concepts**

---

## 🔹 **Streams**

```text id="fh13"
InputStream → read data  
OutputStream → write data
```

---

---

## 🔹 **Byte vs Character Streams**

---

| Type      | Example         | Use         |
| --------- | --------------- | ----------- |
| Byte      | FileInputStream | binary data |
| Character | FileReader      | text data   |

---

---

# 🔥 **Common Mistakes**

---

❌ Not closing file
❌ Ignoring exceptions
❌ Using wrong stream type

---

---

# 🔥 **Best Practices**

---

✔ Always close resources
✔ Use BufferedReader/Writer
✔ Handle exceptions properly

---

---

# 🚀 **Quick Summary**

---

* File → represents file
* Reader → reads data
* Writer → writes data
* Buffered → improves performance
* RandomAccessFile → advanced control

---

```text id="fh14"
File Handling = Persistent Data + Controlled Access
```

---

