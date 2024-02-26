class Roman {
    public int romanToInt(String s) {
        int sum = 0;

        for(int i = 0; i < s.length(); i++)
        {
            char currentChar = s.charAt(i);

            if(currentChar == 'I')
            {
                if((i + 1) < s.length() && s.charAt(i + 1) == 'V')
                {
                    sum += 4;
                    i++;
                }

                else if((i + 1) < s.length() && s.charAt(i + 1) == 'X')
                {
                    sum += 9;
                    i++;
                }

                else
                {
                    sum += 1;
                }
            }

            else if(currentChar == 'V')
            {
                sum += 5;
            }

            else if(currentChar == 'X')
            {
                if((i + 1) < s.length() && s.charAt(i + 1) == 'L')
                {
                    sum += 40;
                    i++;
                }

                else if((i + 1) < s.length() && s.charAt(i + 1) == 'C')
                {
                    sum += 90;
                    i++;
                }

                else 
                {
                    sum += 10;
                }
            }

            else if(currentChar == 'L')
            {
                sum += 50;
            }

            else if(currentChar == 'C')
            {
                if((i + 1) < s.length() && s.charAt(i + 1) == 'D')
                {
                    sum += 400;
                    i++;
                }
                
                else if((i + 1) < s.length() && s.charAt(i + 1) == 'M')
                {
                    sum += 900;
                    i++;
                }

                else
                {
                    sum += 100;
                }
            }

            else if(currentChar == 'D')
            {
                sum += 500;
            }

            else if(currentChar == 'M')
            {
                sum += 1000;
            } 
        }

        return sum;
    }
}

