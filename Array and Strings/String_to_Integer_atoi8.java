
class String_to_Integer_atoi8 {
        public int myAtoi(String s) {
            int n = s.length();
            
            int i=0;
            while(i<n && s.charAt(i) == ' '){
                i++;
            }
            int sign = 1;
            if(i<n && s.charAt(i) =='-'){
                sign =-1;
                i++;
            }else if(i<n && s.charAt(i) =='+'){
                sign =1;
                i++;
            }
            
            int res =0;
            while(i<n && Character.isDigit(s.charAt(i))){
                int digit = s.charAt(i) - '0';
                
                if(res>(Integer.MAX_VALUE -digit)/10){
                    if(sign==1){
                        return Integer.MAX_VALUE;
                    }else{
                        return Integer.MIN_VALUE;
                    }
                }
                i++;
                
                res = (res*10) + digit;
            }
            return res*sign;
            
        }
    }