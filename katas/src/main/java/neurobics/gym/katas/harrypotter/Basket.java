package neurobics.gym.katas.harrypotter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Basket {

    private final Map<HarryPotterBook, Integer> books;

    public Basket() {
        this.books = new HashMap<>();
    }

    public Set<HarryPotterBook> keySet() {
        return books.keySet();
    }

    public Set<Map.Entry<HarryPotterBook, Integer>> entrySet() {
        return books.entrySet();
    }

    public Integer put(HarryPotterBook key, Integer value) {
        return books.put(key, value);
    }

    public int size() {
        return books.size();
    }

    public boolean isEmpty() {
        return books.isEmpty();
    }

    public boolean containsKey(Object key) {
        return books.containsKey(key);
    }

    public boolean containsValue(Object value) {
        return books.containsValue(value);
    }

    public Integer get(Object key) {
        return books.get(key);
    }

    public Integer remove(Object key) {
        return books.remove(key);
    }

    public void putAll(Map<? extends HarryPotterBook, ? extends Integer> m) {
        books.putAll(m);
    }

    public void clear() {
        books.clear();
    }

    public Collection<Integer> values() {
        return books.values();
    }

    public Integer getOrDefault(Object key, Integer defaultValue) {
        return books.getOrDefault(key, defaultValue);
    }

    public void forEach(BiConsumer<? super HarryPotterBook, ? super Integer> action) {
        books.forEach(action);
    }

    public void replaceAll(BiFunction<? super HarryPotterBook, ? super Integer, ? extends Integer> function) {
        books.replaceAll(function);
    }

    public Integer putIfAbsent(HarryPotterBook key, Integer value) {
        return books.putIfAbsent(key, value);
    }

    public boolean remove(Object key, Object value) {
        return books.remove(key, value);
    }

    public boolean replace(HarryPotterBook key, Integer oldValue, Integer newValue) {
        return books.replace(key, oldValue, newValue);
    }

    public Integer replace(HarryPotterBook key, Integer value) {
        return books.replace(key, value);
    }

    public Integer computeIfAbsent(HarryPotterBook key, Function<? super HarryPotterBook, ? extends Integer> mappingFunction) {
        return books.computeIfAbsent(key, mappingFunction);
    }

    public Integer computeIfPresent(HarryPotterBook key, BiFunction<? super HarryPotterBook, ? super Integer, ? extends Integer> remappingFunction) {
        return books.computeIfPresent(key, remappingFunction);
    }

    public Integer compute(HarryPotterBook key, BiFunction<? super HarryPotterBook, ? super Integer, ? extends Integer> remappingFunction) {
        return books.compute(key, remappingFunction);
    }

    public Integer merge(HarryPotterBook key, Integer value, BiFunction<? super Integer, ? super Integer, ? extends Integer> remappingFunction) {
        return books.merge(key, value, remappingFunction);
    }
}
