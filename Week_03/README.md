# 递归模板
```
public void recursion (params ....) 
// recursion terminator 递归终结者
if (level > MAX_LEVEL) {
	process_result;
	result
}
// process logic in current level  处理当前逻辑（分治的话 split）
process(leve, data)
// drill down  下探下一层（分治的话 merge）
self.recursion(leve, p) 
// reverse the current leve status if needed 清理
```


* 不要人肉递归。
* 找出最近重复子问题。（计算机，只包括if else loop，所以基本都有重复子问题）
* 数学归纳法的思维 （当n成立的时候n+1 也成立）