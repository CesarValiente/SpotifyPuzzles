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

package common;

/**
 * 
 * @author cesar.valiente@gmail.com
 * 
 *         This class has all the constants values used in the different puzzles
 * 
 */
public class CommonConstants {

    public static final boolean DEBUG = true;

    public static final String GNU_GPL_OUT_MESSAGE = "SpotifyPuzzles  Copyright (C) 2013  Cesar Valiente Gordo\n"
            + "    This program comes with ABSOLUTELY NO WARRANTY; for details type `show w'.\n"
            + "    This is free software, and you are welcome to redistribute it\n"
            + "    under certain conditions; type `show c' for details."
            + "\n\n";

    public class REVERSED_BINARY_MESSAGES {

        public static final String INPUT_ILLEGAL_NUMBER = "Illegal number of arguments. The correct is just one.";
        public static final String INPUT_ILLEGAL_TYPE = "The input is not an expected type of data (it has to be a number between 1 and 1000000000 (both included)";
        public static final String INPUT_ILLEGAL_RANGE = "The range allowed is a number between 1 and 1000000000 (both included)";
    }
}
