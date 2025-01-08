### 1. **Giới thiệu**
Đoạn code bao gồm hai phần chính:
- Lớp `AlgorithmUtils` chứa phương thức `dijkstra` để tìm đường đi ngắn nhất từ một nút nguồn đến tất cả các nút khác trong đồ thị sử dụng thuật toán Dijkstra.
- Lớp `AlgorithmUtilsTest` chứa các trường hợp kiểm thử để kiểm tra tính đúng đắn của thuật toán Dijkstra.

---

### 2. **Phần chi tiết**

#### **Lớp `AlgorithmUtils`**
Lớp này định nghĩa phương thức `dijkstra` với các thông tin chi tiết như sau:
- **Đầu vào**:
  - `graph`: Đồ thị có trọng số dương, được biểu diễn dưới dạng `Map<Integer, List<int[]>>`. Mỗi phần tử ánh xạ từ một đỉnh (key) đến danh sách các cặp `[đỉnh_kề, trọng_số]`.
  - `startNode`: Nút bắt đầu, từ đó cần tính khoảng cách ngắn nhất đến các nút khác.
- **Đầu ra**:
  - Một `Map<Integer, Integer>` ánh xạ mỗi nút đến khoảng cách ngắn nhất từ `startNode`.

- **Quy trình thực hiện**:
  1. **Khởi tạo**:
     - Tạo một bản đồ `distances` để lưu trữ khoảng cách ngắn nhất từ `startNode` đến tất cả các nút. Ban đầu, mọi khoảng cách được gán giá trị vô cực (`Integer.MAX_VALUE`), ngoại trừ nút bắt đầu có khoảng cách là `0`.
     - Tạo một hàng đợi ưu tiên (`PriorityQueue`) để xử lý các đỉnh theo thứ tự khoảng cách ngắn nhất.
  2. **Thuật toán Dijkstra**:
     - Lặp qua các nút trong hàng đợi ưu tiên:
       - Lấy nút hiện tại có khoảng cách nhỏ nhất từ hàng đợi.
       - Nếu khoảng cách này không phải là nhỏ nhất (đã được cập nhật trước đó), bỏ qua.
       - Duyệt qua các đỉnh kề của nút hiện tại và tính khoảng cách mới. Nếu tìm được đường đi ngắn hơn, cập nhật giá trị trong `distances` và thêm vào hàng đợi ưu tiên.
  3. **Trả về**:
     - Bản đồ `distances` chứa khoảng cách ngắn nhất từ `startNode` đến mỗi nút.

---

#### **Lớp `AlgorithmUtilsTest`**
Lớp này sử dụng thư viện JUnit để kiểm tra phương thức `dijkstra` với các trường hợp khác nhau:
1. **`testDijkstra_SimpleGraph`**:
   - Kiểm tra thuật toán với một đồ thị đơn giản, trong đó các nút được kết nối với các trọng số khác nhau. So sánh kết quả thực tế với kết quả mong đợi.
2. **`testDijkstra_DisconnectedGraph`**:
   - Kiểm tra với một đồ thị rời rạc (có các nút không được kết nối). Kỳ vọng khoảng cách đến các nút không kết nối là `Integer.MAX_VALUE`.
3. **`testDijkstra_SingleNode`**:
   - Kiểm tra với một đồ thị chỉ có một nút. Kỳ vọng khoảng cách từ nút này đến chính nó là `0`.

---

### 3. **Ví dụ đồ thị và kết quả**
- **Đồ thị mẫu (SimpleGraph)**:
  ```
  0 --(4)--> 1
  |         /
  (1)     (2)
  |     /
  2 --(5)--> 3
  ```
  - Đường đi ngắn nhất từ `0`:
    - Đến `0`: 0
    - Đến `1`: 3 (qua 0 → 2 → 1)
    - Đến `2`: 1 (qua 0 → 2)
    - Đến `3`: 4 (qua 0 → 2 → 1 → 3)

---

### 4. **Ý nghĩa**
Thuật toán Dijkstra là một trong những thuật toán tìm đường đi ngắn nhất phổ biến nhất, thường được sử dụng trong các bài toán mạng, giao thông và định tuyến. Đoạn code này minh họa cách triển khai thuật toán một cách hiệu quả và dễ hiểu trong Java, đồng thời có kiểm thử đầy đủ để đảm bảo tính đúng đắn.

[Link chat GPT!](https://chatgpt.com/share/677b56b8-8214-8004-b497-74d92085c2ab)

![Screenshot 2025-01-07 154141](https://github.com/user-attachments/assets/06856f9c-bedf-4ea8-9d5a-e9ae0f91f853)
![image](https://github.com/user-attachments/assets/e48371ed-1bad-4094-b83e-1ea961869119)

