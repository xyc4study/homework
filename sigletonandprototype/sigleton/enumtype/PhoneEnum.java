package sigletonandprototype.sigleton.enumtype;

import sigletonandprototype.sigleton.hungry.PohneByHungry;

//枚举方式时一种特殊的登记注册单例方式，每句类型看作容器，
// 枚举中的常量引用视为登记信息，指向对象就是需要的单例
public enum PhoneEnum {
    IPHONE,
    NOKIA
}
