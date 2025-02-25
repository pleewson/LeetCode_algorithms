package LeetCode_Medium;

// https://leetcode.com/problems/reverse-integer/description/
public class Reverse_Integer {
    public static void main(String[] args) {
        //2147483651

        int x = -463847412;
        //214748364
        //2143847412

        //max 2,147,483,647
        //    1.234.567.8910
        reverse(x);
    }

    public static int reverse(int x) {
        StringBuilder sb = new StringBuilder();
        String str = Integer.toString(x);

        if (str.substring(0, 1).equals("-")) {
            sb.append(str.substring(1, str.length()))
                    .append("-")
                    .reverse();
        } else {
            sb.append(str)
                    .reverse();
        }


        if (sb.charAt(0) == '-') {
            if (sb.length() >= 11) {
                //if '-' appears
                if (Integer.valueOf(sb.charAt(1) - '0') > 2) {
                    return 0;
                } else if (Integer.valueOf(sb.charAt(1) - '0') == 2) {
                    if (Integer.valueOf(sb.charAt(2) - '0') > 1) {
                        return 0;
                    } else if (Integer.valueOf(sb.charAt(2) - '0') == 1) {
                        if (Integer.valueOf(sb.charAt(3) - '0') > 4) {
                            return 0;
                        } else if (Integer.valueOf(sb.charAt(3) - '0') == 4) {
                            if (Integer.valueOf(sb.charAt(4) - '0') > 7) {
                                return 0;
                            } else if (Integer.valueOf(sb.charAt(4) - '0') == 7) {
                                if (Integer.valueOf(sb.charAt(5) - '0') > 4) {
                                    return 0;
                                } else if (Integer.valueOf(sb.charAt(5) - '0') == 4) {
                                    if (Integer.valueOf(sb.charAt(6) - '0') > 8) {
                                        return 0;
                                    } else if (Integer.valueOf(sb.charAt(6) - '0') == 8) {
                                        if (Integer.valueOf(sb.charAt(7) - '0') > 3) {
                                            return 0;
                                        } else if (Integer.valueOf(sb.charAt(7) - '0') == 3) {
                                            if (Integer.valueOf(sb.charAt(8) - '0') > 6) {
                                                return 0;
                                            } else if (Integer.valueOf(sb.charAt(8) - '0') == 6) {
                                                if (Integer.valueOf(sb.charAt(9) - '0') > 4) {
                                                    return 0;
                                                } else if (Integer.valueOf(sb.charAt(9) - '0') == 4) {
                                                    if (Integer.valueOf(sb.charAt(10) - '0') > 7) {
                                                        return 0;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }

                    }
                }
            }
        } else {
            if (sb.length() >= 10) {
                if (Integer.valueOf(sb.charAt(0) - '0') > 2) {
                    return 0;
                } else if (Integer.valueOf(sb.charAt(0) - '0') == 2) {
                    if (Integer.valueOf(sb.charAt(1) - '0') > 1) {
                        return 0;
                    } else if (Integer.valueOf(sb.charAt(1) - '0') == 1) {
                        if (Integer.valueOf(sb.charAt(2) - '0') > 4) {
                            return 0;
                        } else if (Integer.valueOf(sb.charAt(2) - '0') == 4) {
                            if (Integer.valueOf(sb.charAt(3) - '0') > 7) {
                                return 0;
                            } else if (Integer.valueOf(sb.charAt(3) - '0') == 7) {
                                if (Integer.valueOf(sb.charAt(4) - '0') > 4) {
                                    return 0;
                                } else if (Integer.valueOf(sb.charAt(4) - '0') == 4) {
                                    if (Integer.valueOf(sb.charAt(5) - '0') > 8) {
                                        return 0;
                                    } else if (Integer.valueOf(sb.charAt(5) - '0') == 8) {
                                        if (Integer.valueOf(sb.charAt(6) - '0') > 3) {
                                            return 0;
                                        } else if (Integer.valueOf(sb.charAt(6) - '0') == 3) {
                                            if (Integer.valueOf(sb.charAt(7) - '0') > 6) {
                                                return 0;
                                            } else if (Integer.valueOf(sb.charAt(7) - '0') == 6) {
                                                if (Integer.valueOf(sb.charAt(8) - '0') > 4) {
                                                    return 0;
                                                } else if (Integer.valueOf(sb.charAt(8) - '0') == 4) {
                                                    if (Integer.valueOf(sb.charAt(9) - '0') > 7) {
                                                        return 0;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }

                    }
                }
            }
        }

        int output = Integer.valueOf(sb.toString());
        System.out.println(output);

        return output;
    }
}
