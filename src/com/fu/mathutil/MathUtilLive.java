/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author ttphats
 */
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        long result = MathUtil.getFactorial(5);
        
        System.out.println("expected: 5! = 120; actual: " + result);
        System.out.println("expected: 6! = 720; actual: " + MathUtil.getFactorial(6));
        System.out.println("expected: 0! = 1; actual: " + MathUtil.getFactorial(1));
        
        //MathUtil.getFactorial(-5); ném ngoại lệ thật rồi, ai biểu đưa cà chớn chi!!!
        
        //kĩ thuật kiểm thử phần mềm: ước lượng xem giá trị trả về của hàm là gi
        //expected value: 5! = 120
        //mày/hàm ai đó viết khi chạy thực tế là mấy -actual, giả sử 120
    }
    
}
