package com.example.baitapnangcaojunit;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class AlgorithmUtilsTest {

    @Test
    void testDijkstra_SimpleGraph() {
        // Đồ thị mẫu: 0 -> 1 (4), 0 -> 2 (1), 2 -> 1 (2), 1 -> 3 (1), 2 -> 3 (5)
        Map<Integer, List<int[]>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(new int[]{1, 4}, new int[]{2, 1}));
        graph.put(1, Arrays.asList(new int[]{3, 1}));
        graph.put(2, Arrays.asList(new int[]{1, 2}, new int[]{3, 5}));
        graph.put(3, new ArrayList<>());

        // Kết quả mong đợi
        Map<Integer, Integer> expected = new HashMap<>();
        expected.put(0, 0);  // Khoảng cách từ 0 đến chính nó
        expected.put(1, 3);  // Đường ngắn nhất: 0 -> 2 -> 1
        expected.put(2, 1);  // Đường ngắn nhất: 0 -> 2
        expected.put(3, 4);  // Đường ngắn nhất: 0 -> 2 -> 1 -> 3

        // Thực thi thuật toán
        Map<Integer, Integer> result = AlgorithmUtils.dijkstra(graph, 0);

        // So sánh kết quả
        assertEquals(expected, result);
    }

    @Test
    void testDijkstra_DisconnectedGraph() {
        // Đồ thị mẫu: 0 -> 1 (2), 2 -> 3 (1)
        Map<Integer, List<int[]>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(new int[]{1, 2}));
        graph.put(1, new ArrayList<>());
        graph.put(2, Arrays.asList(new int[]{3, 1}));
        graph.put(3, new ArrayList<>());

        // Kết quả mong đợi
        Map<Integer, Integer> expected = new HashMap<>();
        expected.put(0, 0);      // Khoảng cách từ 0 đến chính nó
        expected.put(1, 2);      // Đường ngắn nhất: 0 -> 1
        expected.put(2, Integer.MAX_VALUE); // Không kết nối
        expected.put(3, Integer.MAX_VALUE); // Không kết nối

        // Thực thi thuật toán
        Map<Integer, Integer> result = AlgorithmUtils.dijkstra(graph, 0);

        // So sánh kết quả
        assertEquals(expected, result);
    }

    @Test
    void testDijkstra_SingleNode() {
        // Đồ thị chỉ có một đỉnh
        Map<Integer, List<int[]>> graph = new HashMap<>();
        graph.put(0, new ArrayList<>());

        // Kết quả mong đợi
        Map<Integer, Integer> expected = new HashMap<>();
        expected.put(0, 0); // Khoảng cách từ 0 đến chính nó

        // Thực thi thuật toán
        Map<Integer, Integer> result = AlgorithmUtils.dijkstra(graph, 0);

        // So sánh kết quả
        assertEquals(expected, result);
    }
}
