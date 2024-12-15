package org.example;

public class WordFind {
    public String  findWordWithMostI(String text){
        String[] words = text.split(" ");
        String wordwithmosti = "";
        int maxcount= 0;
        for(String word : words){
            int countI =CountLetterI(word);
            if (countI > maxcount){
                maxcount = countI;
                wordwithmosti = word;
            }
        }
        return wordwithmosti;
    }
    private static int CountLetterI(String word) {
        int count = 0;
        for (char c : word.toLowerCase().toCharArray()) {
            if (c == 'и') {
                count++;
            }
        }
        return count;
    }

    public static int maxDiagonalSum(int[][] array){
        int size = array.length;

        for (int[] row : array) {
            if (row.length != size) {
                throw new IllegalArgumentException("Input matrix must be square.");
            }
        }

        int lefdioganalsum = 0;
        int rightDiagonalSum = 0;

        for (int i = 0; i < size; i++) {
            lefdioganalsum += array[i][i];
            rightDiagonalSum += array[i][size - 1 - i];
        }

        return Math.max(lefdioganalsum, rightDiagonalSum);
        }
    public static String getFirstLettersInUpperCase(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)));
            }
        }

        return result.toString();
    }



    }
