## 哈希表、映射、集合
  * map
  * set
  * 哈希函数，通过散列值映射到数组
  * 如果哈希冲突了，采用拉链式、java8采用红黑树。
  * 哈希表的时间复杂度（添加，删除，查询 O(1)）
  * 哈希表的空间复杂度 O(n)
## 二叉树、二叉搜索树
  * 二叉树，查找O(n)的时间复杂度
  * 二叉搜索树，左子树的所有节点小于根节点，右子树的所有节点大于跟节点，中序遍历是升序的，查找O(LogN)
  * 二叉搜索树，删除一个中间节点，则用右子树的第一个最小节点替代
  * 树的遍历，前（根，左，右） 中（左、跟、右） 后（左，右、跟）
  * https://visualgo.net/zh/bst
## 堆、二叉堆、图
  * 如果形成环就是图
  * 堆，迅速找到一个数据结构中的最大值或者最小值。
  * 找最大就是大顶堆，找最小的就是小顶堆。（查找O(1),插入、删除O(LogN)）
  * 完全二叉树实现，所以可以用数组表示
  * 树种任意节点的总值 >= 其节点的值
  * 索引为i的左儿子 是 2*i+1 ,右儿子 2*i+2，节点为i的父节点为（i-1）/2
  * 优先队列 priority queue
  ```
  heapfiUp:
   while(i > 0 insertValue > heap[parent(i)]) {
       heap[i] = heap[parent(i)]
       i = parent(i);
   }
   heap[i] = insertValue;
   heapfiDown:
   temp = heap[i];
   while(kthChild(i,1) < heapSize) {
      child = maxChild(i);
      if (temp > heap[child]){
        break;
      }
      heap[i] = heap[child];
      i = child;
   }
   heap[i] = temp;
  ```
## HashMap小结
