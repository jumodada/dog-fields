package com.jirengu;

public class Dog {
    private static final int FRIENDLY = 0x1;
    private static final int BIG = 0x2;
    private static final int BLACK = 0x4;
    private int properties = 0;

    // 请补全以下代码

    /**
     * 使用位运算设置狗狗友好的属性
     *
     * @param friendly true为友好，false为不友好
     */
    public void setFriendly(boolean friendly) {}

    /**
     * 这只狗友好吗？请在此处使用位运算读取properties，得到狗是否友好的结果
     *
     * @return 友好则返回true，否则返回false
     */
    public boolean isFriendly() {}

    /**
     * 使用位运算设置狗狗大的属性
     *
     * @param big true为大，false为不大
     */
    public void setBig(boolean big) {}

    /**
     * 这只狗大吗？请在此处使用位运算读取properties，得到狗是否大的结果
     *
     * @return 大则返回true，否则返回false
     */
    public boolean isBig() {}

    /**
     * 使用位运算设置狗狗黑的属性
     *
     * @param black true为黑，false为不黑
     */
    public void setBlack(boolean black) {}

    /**
     * 这只狗黑吗？请在此处使用位运算读取properties，得到狗是否黑的结果
     *
     * @return 黑则返回true，否则返回false
     */
    public boolean isBlack() {}
}
