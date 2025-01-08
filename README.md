# **Mô tả:**

Đoạn mã triển khai thuật toán Dijkstra để tìm đường đi ngắn nhất trong đồ thị có trọng số. Đồng thời, các kiểm thử đơn vị được viết để đảm bảo tính đúng đắn của thuật toán trong các trường hợp khác nhau.

---

# **Yêu cầu chi tiết:**

**Tạo lớp `AlgorithmUtils` với các phương thức sau:**

- `dijkstra(Map<Integer, List<Edge>> graph, int source)`: 
  - Triển khai thuật toán Dijkstra để tính toán đường đi ngắn nhất từ một nút nguồn đến tất cả các nút khác trong đồ thị.
  - Trả về một `Map<Integer, Integer>` chứa khoảng cách ngắn nhất từ nút nguồn đến từng nút.

**Viết lớp `AlgorithmUtilsTest` để kiểm thử các phương thức trong `AlgorithmUtils`. Sử dụng JUnit 5.**

---

# **Phạm vi kiểm thử:**

**Mục tiêu kiểm thử:**  
Đảm bảo tính đúng đắn của thuật toán Dijkstra thông qua các trường hợp kiểm thử sau:  

### **Kiểm thử cơ bản:**
1. **Đồ thị đơn giản (SimpleGraph):**  
   Kiểm tra thuật toán với đồ thị kết nối đầy đủ có các trọng số khác nhau.
2. **Đồ thị rời rạc (DisconnectedGraph):**  
   Đảm bảo thuật toán xử lý chính xác khi có các nút không kết nối.
3. **Đồ thị chỉ có một nút (SingleNode):**  
   Kiểm tra khi đồ thị chỉ chứa một nút duy nhất.

### **Kiểm thử nâng cao:**
1. **Đầu vào không hợp lệ:**
   - Đồ thị rỗng hoặc null.
   - Nút bắt đầu không tồn tại trong đồ thị.
2. **Tình huống biên:**
   - Đồ thị chỉ có một cạnh hoặc không có cạnh.
   - Đồ thị có chu trình.
3. **Đồ thị lớn:**  
   Kiểm tra hiệu suất của thuật toán với đồ thị lớn (nhiều nút và cạnh).

---

# **Tuân theo nguyên tắc FIRST của kiểm thử phần mềm:**

- **Nhanh chóng (Fast):** Các kiểm thử được thiết kế đơn giản, chạy nhanh.  
- **Độc lập (Independent):** Mỗi kiểm thử không phụ thuộc vào kiểm thử khác.  
- **Có thể lặp lại (Repeatable):** Các kiểm thử luôn cho kết quả nhất quán trong cùng điều kiện.  
- **Tự xác nhận (Self-validating):** Sử dụng các biểu thức kiểm tra (`assertEquals`, `assertThrows`) để xác minh kết quả.  
- **Kịp thời (Timely):** Tập trung vào các chức năng chính của thuật toán.  

---

# **Các kịch bản kiểm thử chính:**

### **Kiểm thử cơ bản:**
- `testDijkstra_WithSimpleGraph()`: Đảm bảo thuật toán trả về kết quả đúng với đồ thị đơn giản.
- `testDijkstra_WithDisconnectedGraph()`: Xác minh kết quả khi đồ thị có các nút không kết nối.
- `testDijkstra_WithSingleNode()`: Đảm bảo thuật toán xử lý chính xác khi đồ thị chỉ có một nút.

### **Kiểm thử nâng cao:**
- `testDijkstra_WithNullGraph()`: Kiểm tra ngoại lệ khi đầu vào là null.
- `testDijkstra_WithNonExistentSource()`: Kiểm tra ngoại lệ khi nút nguồn không tồn tại trong đồ thị.
- `testDijkstra_WithCycle()`: Kiểm tra thuật toán với đồ thị có chu trình.
- `testDijkstra_WithLargeGraph()`: Đánh giá hiệu suất với đồ thị lớn.

---

# **Cấu trúc và tổ chức mã kiểm thử:**

1. **Đặt tên rõ ràng:**  
   Sử dụng các tên như `testDijkstra_WithSimpleGraph` để dễ dàng hiểu mục đích của từng kiểm thử.

2. **Phân nhóm hợp lý:**  
   - Các kiểm thử cơ bản: Đồ thị đơn giản, rời rạc, đơn nút.  
   - Các kiểm thử nâng cao: Đầu vào không hợp lệ, đồ thị lớn, chu trình.

3. **Chú thích rõ ràng:**  
   Thêm chú thích trong mỗi phương thức kiểm thử để giải thích mục đích và các bước thực hiện.

---

# **Kiểm thử tích hợp:**

Ngoài kiểm thử đơn vị, hãy bổ sung các kiểm thử tích hợp:
- Kiểm tra thuật toán Dijkstra khi được sử dụng trong các hệ thống lớn, ví dụ hệ thống định tuyến hoặc tìm đường thực tế.

---

# **Sử dụng các công cụ phân tích mã:**

- **SonarQube**: Đánh giá độ bao phủ kiểm thử và chất lượng mã.  
- **JaCoCo**: Kiểm tra tỷ lệ mã được kiểm thử.  

---

# **Kết luận:**

Thuật toán Dijkstra và các kiểm thử tương ứng cung cấp nền tảng vững chắc để giải quyết bài toán tìm đường đi ngắn nhất. Bằng cách mở rộng kiểm thử, tổ chức mã hợp lý, bổ sung tài liệu, và sử dụng các công cụ phân tích, bạn có thể tăng cường độ tin cậy và hiệu quả của ứng dụng.


[Link chat GPT!](https://chatgpt.com/share/677b56b8-8214-8004-b497-74d92085c2ab)

![Screenshot 2025-01-07 154141](https://github.com/user-attachments/assets/06856f9c-bedf-4ea8-9d5a-e9ae0f91f853)
![image](https://github.com/user-attachments/assets/e48371ed-1bad-4094-b83e-1ea961869119)

