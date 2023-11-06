package Strings;

public class CountingDuplicates {
    public static int duplicateCount(String s) {
        char[] c1 = s.toCharArray();
        for (int x=0; x<c1.length; x++) {
            c1[x] = Character.toUpperCase(c1[x]);
        }
        int[] f = new int[s.length()];
        for(int i=0;i<s.length();i++) {
            for(int j=0;j<s.length();j++) {
                if(c1[i]==c1[j]) {
                    f[i]++;
                }
            }
        }
        int counter = 0;
        for(int k=0;k<c1.length;k++) {
            for(int l=0;l<c1.length;l++) {
                if(c1[k]==c1[l]) {
                    if(l!=k) {c1[k]=0;f[k]=0;}
                }
            }
            if (f[k] >= 2) {
                counter++;
            }
        }
        return counter;
    }
}

