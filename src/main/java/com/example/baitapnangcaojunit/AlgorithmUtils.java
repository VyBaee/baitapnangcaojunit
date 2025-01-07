package com.example.baitapnangcaojunit;

import java.util.*;

public class AlgorithmUtils {

    /**
     * Tìm đường đi ngắn nhất từ một nút nguồn đến tất cả các nút khác trong đồ thị bằng thuật toán Dijkstra.
     *
     * @param graph     Đồ thị có trọng số dương (bản đồ ánh xạ từ một đỉnh tới danh sách cạnh [đỉnh_kề, trọng_số]).
     * @param startNode Nút bắt đầu.
     * @return Bản đồ ánh xạ từ mỗi nút đến khoảng cách ngắn nhất từ startNode.
     */
    public static Map<Integer, Integer> dijkstra(Map<Integer, List<int[]>> graph, int startNode) {
        // Kết quả lưu khoảng cách ngắn nhất từ startNode đến mỗi nút
        Map<Integer, Integer> distances = new HashMap<>();
        // Hàng đợi ưu tiên để chọn đỉnh có khoảng cách nhỏ nhất
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));

        // Khởi tạo khoảng cách đến tất cả các nút là vô cực
        for (int node : graph.keySet()) {
            distances.put(node, Integer.MAX_VALUE);
        }
        distances.put(startNode, 0); // Khoảng cách từ startNode đến chính nó là 0
        priorityQueue.offer(new int[]{startNode, 0});

        while (!priorityQueue.isEmpty()) {
            int[] current = priorityQueue.poll();
            int currentNode = current[0];
            int currentDistance = current[1];

            // Bỏ qua nếu khoảng cách trong priorityQueue không phải là nhỏ nhất hiện tại
            if (currentDistance > distances.get(currentNode)) {
                continue;
            }

            // Duyệt tất cả các đỉnh kề của currentNode
            for (int[] neighbor : graph.getOrDefault(currentNode, new ArrayList<>())) {
                int neighborNode = neighbor[0];
                int edgeWeight = neighbor[1];
                int newDistance = currentDistance + edgeWeight;

                // Cập nhật khoảng cách nếu tìm được đường ngắn hơn
                if (newDistance < distances.get(neighborNode)) {
                    distances.put(neighborNode, newDistance);
                    priorityQueue.offer(new int[]{neighborNode, newDistance});
                }
            }
        }

        return distances;
    }
}
