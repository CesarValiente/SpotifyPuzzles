/*
 *   Copyright (C) 2013  Cesar Valiente Gordo (cesar.valiente@gmail.com)

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.

 */

package puzzles;

import common.CommonConstants;
import common.Log;

/**
 * 
 * @author cesar.valiente@gmail.com
 * 
 *         This class is created to implement the first of the three proposed
 *         puzzles in the Spotify website
 *         (https://www.spotify.com/uk/jobs/tech/reversed-binary/)
 * 
 */
public class ReversedBinary {

    public static void main(final String[] args) {

        isStdinCorrect(args);

        int number = Integer.parseInt(args[0]);
        String binary = Integer.toBinaryString(number);
        String reversedBinary = reverseString(binary);
        int result = Integer.parseInt(reversedBinary, 2);

        Log.v(String.valueOf(result));
    }

    /**
     * This function checks the stdin of the program to check if the given
     * paramenter is correct or not
     * 
     * @param args
     */
    private static void isStdinCorrect(final String[] args) {

        if (args != null && args.length == 1) {
            try {
                int number = Integer.parseInt(args[0]);
                if (number >= 1 && number <= 1000000000) {
                    return;
                } else {
                    Log.d(CommonConstants.GNU_GPL_OUT_MESSAGE
                            + CommonConstants.REVERSED_BINARY_MESSAGES.INPUT_ILLEGAL_RANGE);
                    System.exit(1);
                }
            } catch (NumberFormatException e) {
                Log.e(e,
                        CommonConstants.GNU_GPL_OUT_MESSAGE
                                + CommonConstants.REVERSED_BINARY_MESSAGES.INPUT_ILLEGAL_TYPE);
                System.exit(1);
            }
        } else {
            Log.d(CommonConstants.GNU_GPL_OUT_MESSAGE
                    + CommonConstants.REVERSED_BINARY_MESSAGES.INPUT_ILLEGAL_NUMBER);
            System.exit(1);
        }
    }

    /**
     * This function reverses a given {@link String} using library functions.
     * 
     * @param data
     * @return
     */
    private static String reverseString(final String data) {

        StringBuffer buffer = new StringBuffer(data);
        return buffer.reverse().toString();
    }

}
