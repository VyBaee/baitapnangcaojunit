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
- **Kịp thời (Timely):** Tập trung vào các chức năng chính của thuật


[Link chat GPT!](https://chatgpt.com/share/677b56b8-8214-8004-b497-74d92085c2ab)

![Screenshot 2025-01-07 154141](https://github.com/user-attachments/assets/06856f9c-bedf-4ea8-9d5a-e9ae0f91f853)
![image](https://github.com/user-attachments/assets/e48371ed-1bad-4094-b83e-1ea961869119)

