package com.codedifferentlty;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void snakeCaseTest01(){
        String input = "Revolt is the right of the people";
        String expected = "revolt_is_the_right_of_the_people";
        String actual = Solution.snakeCase(input);
        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void snakeCaseTest02(){
        String input = "WuTang Clan Ain't Nothing To Mess With";
        String expected = "wutang_clan_ain_t_nothing_to_mess_with";
        String actual = Solution.snakeCase(input);
        Assertions.assertEquals(expected, actual);
    }


}
