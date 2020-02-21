package runner;

import cucumber.api.java.ru.*;

public class MyStepdefs {

    @Дано("^на счете пользователя имеется (\\d+) рублей$")
    public void наСчетеПользователяИмеетсяРублей(int arg1) throws Throwable {
        System.out.println("1");
    }

    @Когда("^пользователь снимает со счета (\\d+) рублей$")
    public void пользовательСнимаетСоСчетаРублей(int arg1) throws Throwable {
        System.out.println("2");
    }

    @Тогда("^появляется предупреждение \"([^\"]*)\"$")
    public void появляетсяПредупреждение(String arg1) throws Throwable {
        System.out.println("3");
    }

    @Когда("^Выполнить скрипт \"([^\"]*)\", наполнения бд \"([^\"]*)\" запис\\(ью/-ями\\) с полем \"([^\"]*)\" = \"([^\"]*)\"$")
    public void выполнитьСкриптНаполненияБдЗаписЬюЯмиСПолем(String arg0, String arg1, String arg2, String arg3) throws Throwable {


    }
}
