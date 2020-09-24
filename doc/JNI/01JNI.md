#1、什么是JNI?
    JNI是Java Native Interface的缩写，它提供了若干的API实现了Java和其他语言的通信（主要是C&C++）.
    通俗来说,就是JAVA调用C/C++函数的接口.如果你要想调用C系列的函数,你就必须遵守这样的约定.
#2、JNI接口都长什么样?
    就一个native的关键字.
```java
public  class NativeDemo {
	{
		/**
		 * 系统加载其他的语言的函数
		 */
		System.load("C:\\Users\\Administrator\\Desktop\\com\\Hello.dll");
	}
	/**
	 * 就这个natice关键字.标记了这个接口,看起来像是abstract
	 */
	public native void sayHello();
	
	
	public static void main(String[] args) {
		new NativeDemo().sayHello();
	}
}
```
    执行这个方法时,会根据jni.h来找到真正的C来编写的sayHello()的实际函数.
#3、jni.h是什么?
    它实际上就存在%JAVA_HOME%\bin\include下面的一个文件,另外还有个%JAVA_HOME%\bin\include\win32下的jni_md.h.
    它有个很好的方法就是通过native接口名,获取C函数.打个比方类似如下:
        public static String getCMethod(String javaMethodName);
    
    它可以根据你的java接口,找到C函数并调用.
    
    但这就意味着,你不能在C里随意写函数名,因为如果你写的java方法叫native xxx();C函数也叫aaa();
    但jni.h通过getCMethod(String javaMethodName)去找的结果是xxx();那这样就无法调用了.
    
