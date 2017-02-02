// Don't edit this file
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author meanmail
 */
public class MainTest {
    private static final String[] sampleInputRoles1 = new String[]{
            "Городничий",
            "Аммос Федорович",
            "Артемий Филиппович",
            "Лука Лукич"
    };

    private static final String[] sampleInputTextLines1 = new String[]{
            "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
            "Аммос Федорович: Как ревизор?",
            "Артемий Филиппович: Как ревизор?",
            "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
            "Аммос Федорович: Вот те на!",
            "Артемий Филиппович: Вот не было заботы, так подай!",
            "Лука Лукич: Господи боже! еще и с секретным предписаньем!"
    };

    private static final String sampleOutput1 = "Городничий:\n" +
            "1) Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.\n" +
            "4) Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.\n" +
            "\n" +
            "Аммос Федорович:\n" +
            "2) Как ревизор?\n" +
            "5) Вот те на!\n" +
            "\n" +
            "Артемий Филиппович:\n" +
            "3) Как ревизор?\n" +
            "6) Вот не было заботы, так подай!\n" +
            "\n" +
            "Лука Лукич:\n" +
            "7) Господи боже! еще и с секретным предписаньем!\n\n";

    @Test
    public void printTextPerRoleSample1() throws Exception {
        assertEquals(sampleOutput1, Main.printTextPerRole(sampleInputRoles1, sampleInputTextLines1));
    }

}