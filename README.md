# **Thuật toán Dijkstra**

## **1. Mô tả**
Thuật toán Dijkstra được sử dụng để tìm đường đi ngắn nhất từ một đỉnh nguồn đến tất cả các đỉnh khác trong đồ thị có trọng số dương.  

- **Đầu vào**:  
  - Một đồ thị có trọng số dương được biểu diễn dưới dạng bản đồ (Map).  
  - Một đỉnh nguồn (`startNode`).  

- **Đầu ra**:  
  - Bản đồ ánh xạ từ mỗi đỉnh trong đồ thị đến khoảng cách ngắn nhất từ đỉnh nguồn.  

### **Cách hoạt động**
1. Sử dụng hàng đợi ưu tiên để quản lý các đỉnh theo khoảng cách ngắn nhất hiện tại.  
2. Duyệt qua các đỉnh kề để cập nhật khoảng cách ngắn nhất từ đỉnh nguồn.  
3. Tiếp tục quá trình đến khi tất cả các đỉnh được xử lý.  

---

## **2. Kiểm thử**

### **Mục tiêu kiểm thử**
- Xác minh tính chính xác của thuật toán với các loại đồ thị khác nhau.  
- Đảm bảo xử lý đúng các trường hợp biên, bao gồm:
  - Đồ thị rỗng.  
  - Đồ thị có nhiều cạnh nối giữa cùng một cặp đỉnh.  
  - Đồ thị không kết nối hoàn toàn.  

### **Các kịch bản kiểm thử**
1. **Đồ thị đơn giản**:  
   - **Đầu vào**:  
     ```
     0 -> 1 (4), 0 -> 2 (1), 2 -> 1 (2), 1 -> 3 (1), 2 -> 3 (5)
     ```
   - **Đỉnh nguồn**: 0  
   - **Kết quả mong đợi**:  
     ```
     0 -> 0, 1 -> 3, 2 -> 1, 3 -> 4
     ```

2. **Đồ thị không kết nối hoàn toàn**:  
   - **Đầu vào**:  
     ```
     0 -> 1 (2), 2 -> 3 (1)
     ```
   - **Đỉnh nguồn**: 0  
   - **Kết quả mong đợi**:  
     ```
     0 -> 0, 1 -> 2, 2 -> ∞, 3 -> ∞
     ```

3. **Đồ thị chỉ có một đỉnh**:  
   - **Đầu vào**:  
     ```
     0
     ```
   - **Đỉnh nguồn**: 0  
   - **Kết quả mong đợi**:  
     ```
     0 -> 0
     ```

4. **Đồ thị có chu trình**:  
   - **Đầu vào**:  
     ```
     0 -> 1 (1), 1 -> 2 (1), 2 -> 0 (1), 1 -> 3 (1)
     ```
   - **Đỉnh nguồn**: 0  
   - **Kết quả mong đợi**:  
     ```
     0 -> 0, 1 -> 1, 2 -> 2, 3 -> 2
     ```

---

## **3. Kết quả kiểm thử**

### **Kịch bản 1: Đồ thị đơn giản**
- **Đầu vào**:  
  ```
  0 -> 1 (4), 0 -> 2 (1), 2 -> 1 (2), 1 -> 3 (1), 2 -> 3 (5)
  ```
- **Kết quả mong đợi**:  
  ```
  0 -> 0, 1 -> 3, 2 -> 1, 3 -> 4
  ```
- **Kết quả thực tế**:  
  ```
  PASS
  ```

### **Kịch bản 2: Đồ thị không kết nối hoàn toàn**
- **Đầu vào**:  
  ```
  0 -> 1 (2), 2 -> 3 (1)
  ```
- **Kết quả mong đợi**:  
  ```
  0 -> 0, 1 -> 2, 2 -> ∞, 3 -> ∞
  ```
- **Kết quả thực tế**:  
  ```
  PASS
  ```

### **Kịch bản 3: Đồ thị chỉ có một đỉnh**
- **Đầu vào**:  
  ```
  0
  ```
- **Kết quả mong đợi**:  
  ```
  0 -> 0
  ```
- **Kết quả thực tế**:  
  ```
  PASS
  ```

### **Kịch bản 4: Đồ thị có chu trình**
- **Đầu vào**:  
  ```
  0 -> 1 (1), 1 -> 2 (1), 2 -> 0 (1), 1 -> 3 (1)
  ```
- **Kết quả mong đợi**:  
  ```
  0 -> 0, 1 -> 1, 2 -> 2, 3 -> 2
  ```
- **Kết quả thực tế**:  
  ```
  PASS
  ```

---

## **4. Ghi chú**
- Để chạy kiểm thử, sử dụng **JUnit 5** và đảm bảo cài đặt thư viện trong dự án.  
- Mọi kịch bản kiểm thử đều được thực hiện thành công.


## **Đo Mức Độ Bao Phủ Kiểm Thử và Tăng Mức Độ Bao Phủ Dòng Lệnh (Statement Coverage)**

### **1. Đo Mức Độ Bao Phủ Kiểm Thử (Test Coverage)**
Để đo mức độ bao phủ kiểm thử trong dự án Java, chúng ta sử dụng **JaCoCo**, một công cụ tích hợp với Maven để phân tích bao phủ kiểm thử. Sau khi cấu hình JaCoCo trong file `pom.xml`, có thể chạy các lệnh Maven để tạo báo cáo bao phủ kiểm thử.

#### **Cấu hình JaCoCo trong `pom.xml`**
Cập nhật cấu hình plugin JaCoCo vào phần `<build>` trong file `pom.xml` của dự án:

```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.jacoco</groupId>
            <artifactId>jacoco-maven-plugin</artifactId>
            <version>0.8.10</version>
            <executions>
                <execution>
                    <goals>
                        <goal>prepare-agent</goal>
                    </goals>
                </execution>
                <execution>
                    <id>report</id>
                    <phase>verify</phase>
                    <goals>
                        <goal>report</goal>
                    </goals>
                </execution>
            </executions>
        </plugin>
    </plugins>
</build>
```

#### **Chạy JaCoCo để Tạo Báo Cáo Bao Phủ**
Sau khi thêm cấu hình, có thể chạy lệnh sau để kiểm tra mức độ bao phủ kiểm thử:

```bash
mvn clean verify
```

Sau khi chạy lệnh, JaCoCo sẽ tạo báo cáo trong thư mục `target/site/jacoco/` với tệp `index.html`. Có thể mở tệp này trong trình duyệt để xem báo cáo.

### **2. Bổ Sung Ca Kiểm Thử Để Đạt Mức Độ Bao Phủ Dòng Lệnh (Statement Coverage) 100%**

**Statement Coverage** đo lường tỷ lệ bao phủ của các câu lệnh trong mã nguồn. Để đạt mức độ bao phủ 100%, cần kiểm tra tất cả các dòng mã và đảm bảo rằng mỗi dòng mã đều được thực thi ít nhất một lần trong quá trình kiểm thử.

#### **Xác Định Dòng Mã Chưa Được Kiểm Thử**
Mở báo cáo JaCoCo trong thư mục `target/site/jacoco/index.html`. Các dòng mã chưa được kiểm thử sẽ có màu **đỏ**. Hãy chú ý đến các dòng mã đó.

#### **Bổ Sung Ca Kiểm Thử**
Dựa trên các dòng mã chưa được kiểm thử, cần bổ sung các ca kiểm thử để đảm bảo tất cả các câu lệnh được thực thi trong kiểm thử. Ví dụ:
- Kiểm thử các nhánh điều kiện `if`, `else`, `switch` mà chưa được kiểm thử.
- Bổ sung các trường hợp ngoại lệ hoặc các tình huống biên (edge cases) mà chưa được kiểm thử.

#### **Chạy Lại Kiểm Thử và Kiểm Tra Báo Cáo**
Sau khi bổ sung các ca kiểm thử, chạy lại lệnh kiểm thử:

```bash
mvn test
```

Sau đó, kiểm tra lại báo cáo JaCoCo để đảm bảo rằng mức độ bao phủ đã đạt 100%.

---

### **Kết Luận**
Việc đo mức độ bao phủ kiểm thử và bổ sung các ca kiểm thử là một phần quan trọng để đảm bảo rằng mã nguồn được kiểm tra toàn diện. Sử dụng công cụ như JaCoCo giúp bạn dễ dàng theo dõi và đạt được mức độ bao phủ kiểm thử dòng lệnh lên đến 100%.

### **Giải thích về các phần trong README.md**:

1. **Cấu hình JaCoCo**: Đây là phần cấu hình để tích hợp JaCoCo vào dự án Maven của bạn. JaCoCo sẽ tự động tạo báo cáo bao phủ kiểm thử sau khi kiểm thử được chạy.
   
2. **Chạy JaCoCo**: Các lệnh Maven giúp bạn chạy kiểm thử và tạo báo cáo bao phủ kiểm thử, giúp bạn dễ dàng xác định các dòng mã chưa được kiểm thử.

3. **Bổ sung ca kiểm thử**: Hướng dẫn về cách xác định các dòng mã chưa được kiểm thử và bổ sung các ca kiểm thử để đảm bảo bao phủ 100% dòng lệnh.

4. **Kiểm tra lại báo cáo**: Sau khi bổ sung các ca kiểm thử, bạn sẽ kiểm tra lại báo cáo JaCoCo để chắc chắn rằng bạn đã đạt được mức độ bao phủ cao nhất.

[Link chat GPT!](https://chatgpt.com/share/677b56b8-8214-8004-b497-74d92085c2ab)

![Screenshot 2025-01-07 154141](https://github.com/user-attachments/assets/06856f9c-bedf-4ea8-9d5a-e9ae0f91f853)
![image](https://github.com/user-attachments/assets/e48371ed-1bad-4094-b83e-1ea961869119)

