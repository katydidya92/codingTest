package com.example.codingtest.bigO;

import org.junit.jupiter.api.Test;

public class sumTest {


    @Test
    void sumTest() {
        System.out.println(sum(10));
        System.out.println("===============");
        System.out.println(sum2(10));
    }

    /**
     * 1부터 n까지 합을 구하는 알고리즘
     * 입력 n에 따라 덧셈을 n번 해야 함
     * 시간복잡도 : n, 빅 오 표기법 O(n)
     */
    private static int sum(int n) {
        int total = 0;
        for (int i = 0; i <= n; i++) {
            total += i;
        }
        return total;
    }

    /**
     * 1부터 n까지 합을 구하는 알고리즘
     * 반복문이 없음
     * 시간복잡도 : 1 , 빅 오 표기법 O(1)
     */
    private static int sum2(int n) {
        return n * (n + 1) / 2;
    }
}
