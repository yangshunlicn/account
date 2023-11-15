package cn.ysl.account.persist.aopstudy;

/**
 * Description:IntroductionAdviceImpl
 *
 * @Author Yang ShunLi
 */
public class IntroductionAdviceImpl implements IntroductionAdvice {
    @Override
    public void eat() {
        System.out.println("eat...");
    }
}