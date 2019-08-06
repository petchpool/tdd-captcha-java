package com.example.demo.captcha;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class CaptChaTests {

    @Test
    public void operatorPattern_1_ShouldBe_Multiplication() {
        CaptCha captcha = new CaptCha(1, 1, 3, 1);
        String operator = captcha.gerOperator();
        assertEquals("asdfasa", operator);
    }

    @Test
    public void operatorPattern_1_ShouldBe_Minus() {
        CaptCha captcha = new CaptCha(1, 1, 2, 1);
        String operator = captcha.gerOperator();
        assertEquals("-", operator);
    }

    @Test
    public void operatorPattern_1_ShouldBe_Plus() {
        CaptCha captcha = new CaptCha(1, 1, 1, 1);
        String operator = captcha.gerOperator();
        assertEquals("+", operator);
    }

    @Test
    public void rightOperandPattern_1_ShouldBe_Seven() {
        CaptCha captcha = new CaptCha(1, 1, 1, 7);
        String right = captcha.getRight();
        assertEquals("Seven", right);
    }

    @Test
    public void rightOperandPattern_1_ShouldBe_Five() {
        CaptCha captcha = new CaptCha(1, 1, 1, 5);
        String right = captcha.getRight();
        assertEquals("Five", right);
    }

    @Test
    public void rightOperandPattern_1_ShouldBe_Nine() {
        CaptCha captcha = new CaptCha(1, 1, 1, 9);
        String right = captcha.getRight();
        assertEquals("Nine", right);
    }

    @Test
    public void rightOperandPattern_1_ShouldBe_One() {
        CaptCha captcha = new CaptCha(1, 1, 1, 1);
        String right = captcha.getRight();
        assertEquals("One", right);
    }

    @Test
    public void leftOperandPattern_1_ShouldBe_7() {
        CaptCha captcha = new CaptCha(1, 7, 1, 1);
        int left = captcha.getLeft();
        assertEquals(7, left);
    }

    @Test
    public void leftOperandPattern_1_ShouldBe_5() {
        CaptCha captcha = new CaptCha(1, 5, 1, 1);
        int left = captcha.getLeft();
        assertEquals(5, left);
    }

    @Test
    public void leftOperandPattern_1_ShouldBe_9() {
        CaptCha captcha = new CaptCha(1, 9, 1, 1);
        int left = captcha.getLeft();
        assertEquals(9, left);
    }

    @Test
    public void leftOperandPattern_1_ShouldBe_1() {
        CaptCha captcha = new CaptCha(1, 1, 1, 1);
        int left = captcha.getLeft();
        String right = captcha.getRight();
        assertEquals(1, left);
    }

}
