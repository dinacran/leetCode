import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import utils.CollectionUtils;

void main() {

    CollectionUtils.printListOfListString(groupAnagrams(new String[]{"","b",""}));

}

public List<List<String>> groupAnagrams(String[] strs) {

    List<String> list = new ArrayList<>(List.of(strs));

    List<List<String>> res = new ArrayList<List<String>>();

    for (int i = 0; i < list.size(); i++) {

        List<String> currList = new ArrayList<>();
        currList.add(list.get(i));

        Set<Character> set = new HashSet<>();
        for (char c : list.get(i).toCharArray())
            set.add(c);

        int initialSize = set.size();

        for (int j = i + 1; j < list.size(); j++) {

            Set<Character> tempSet = set;

            for (char c : list.get(j).toCharArray())
                tempSet.add(c);
            CollectionUtils.printCharSet(tempSet);

            if (initialSize == tempSet.size()) {
                currList.add(list.get(j));
                list.remove(j--);
            }
        }
        res.add(currList);

    }

    return res;

}
