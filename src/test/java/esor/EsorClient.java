/**
 * Linkipedia, Copyright (c) 2015 Tetherless World Constellation 
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package esor;

import utils.ConceptItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xixiluo on 2/16/15.
 */
public class EsorClient {

    public static void main(String[] args) throws Exception{
        EsorService esorS = new EsorService();

        //List<ConceptItem> res = esorS.getConcepts("carbon");

        //List<ConceptItem> res = esorS.getConcepts("carbon");
        List<ConceptItem> res = esorS.getConcepts("Herbicide Used");
        //List<ConceptItem> res = esorS.getConcepts("carbon,mass");


        for(int i = 0 ; i < res.size(); i++){
            ConceptItem c = res.get(i);
            System.out.println(c.getUri());
            System.out.println(c.getWeight());
        }
    }
}
