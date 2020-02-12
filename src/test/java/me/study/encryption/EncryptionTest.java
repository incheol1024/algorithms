package me.study.encryption;

import org.assertj.core.api.Assertions;
import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsNot;
import org.hamcrest.core.IsSame;
import org.hamcrest.core.StringContains;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class EncryptionTest {

    String input;
    String output;

    @Before
    public void setUp() throws Exception {
        input = "haveaniceday";
        output = "hae and via ecy";
    }

    @Test
    public void encryption() {
        String actual = Encryption.encryption(input);
        MatcherAssert.assertThat("reason",actual, IsNot.not(input));
        MatcherAssert.assertThat(actual, StringContains.containsString(output));
        MatcherAssert.assertThat(actual, Is.is(CoreMatchers.equalTo(output)));

        Assertions.assertThat(actual).isEqualTo(output).isNotEmpty().withFailMessage("return value is not correct.");
    }
}
