package com.rakesh;

public class LongestCommomprefix {
    public String longestCommonPrefix(String[] String)
    {
        /**
         * this function conclude longest commom prifix
         * tis take longest sting array as input
         * we are using veriable "prifix to keep track pf
         * prefix we computed
         *
         */
        if(0==String.length)
        {
            return "";

        }
        for(int prefixlen=0;prefixlen < String[0].length();prefixlen++)
        {
            char toMatch= String[0].charAt(prefixlen);
            for(int i=1;i<String.length;i++)
            {
              if(prefixlen>=String[i].length()|| String[i].charAt(prefixlen)!=toMatch)
                {
                    return String[0].substring(0,prefixlen);

                }
            }
        }
        return String[0];
    }

    public static void main(String[] args) {
        LongestCommomprefix longestCommomprefix=new LongestCommomprefix();

        String[]testcase1={"flower","flow","flowInsight"};
        System.out.println("common prefix of testcase1:"+ longestCommomprefix.longestCommonPrefix(testcase1));

        String[] testcase2={"dog","cat" ,"bird"};
        System.out.println("common prefix of testcase1:"+ longestCommomprefix.longestCommonPrefix(testcase2));


        String[] testcase3={"class","classes",""};
        System.out.println("common prefix of testcase1:"+ longestCommomprefix.longestCommonPrefix(testcase3));


    }
}
