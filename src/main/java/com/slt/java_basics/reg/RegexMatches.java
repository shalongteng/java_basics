package com.slt.java_basics.reg;

import org.springframework.util.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * pattern 对象是一个正则表达式的编译表示。
 * Matcher 对象是对输入字符串进行解释和匹配操作的引擎。
 * group(0)，它总是代表整个表达式
 */
public class RegexMatches {

   public static void main( String args[] ){

      //按指定模式在字符串查找
      String line = "This order was placed for QT3000! OK?";
      String pattern = "(\\D*)(\\d+)(.*)";

      //创建 Pattern 对象
      Pattern r = Pattern.compile(pattern);

      //创建 matcher 对象
      Matcher matcher = r.matcher(line);
      if (matcher.find()) {
         System.out.println("Found value: " + matcher.group(0) );
         System.out.println("Found value: " + matcher.group(1) );
         System.out.println("Found value: " + matcher.group(2) );
         System.out.println("Found value: " + matcher.group(3) );
         System.out.println("Found value: " + matcher.group() );
      } else {
         System.out.println("NO MATCH");
      }
   }

   /**
    * 大写字母转下划线加小写字母
    */
   public static String camel4underline(String param){
      if(StringUtils.isEmpty(param)){
         return "";
      }
      StringBuilder builder = new StringBuilder(param);
      Pattern pattern = Pattern.compile("[A-Z]");
      Matcher matcher = pattern.matcher(param);
      int i = 0;
      while(matcher.find()){
         builder.replace(matcher.start()+i, matcher.end()+i, "_"+matcher.group().toLowerCase());
         i++;//每次替换加一个下划线，所以用i表示下划线数量
      }
      if('_' == builder.charAt(0)){
         builder.deleteCharAt(0);
      }
      return builder.toString();
   }
}
