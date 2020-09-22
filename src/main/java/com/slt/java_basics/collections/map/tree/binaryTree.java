package com.slt.java_basics.collections.map.tree;

/**
 * 二叉树
 *  二叉树的每个结点至多只有二棵子树(不存在度大于2的结点)，二叉树的子树有左右之分，次序不能颠倒。
 * 二叉排序树：
 *      它和二分查找一样，插入和查找的时间复杂度均为O(logn)，但是在最坏的情况下仍然会有O(n)的时间复杂度。
 *      原因在于插入和删除元素的时候，树没有保持平衡，我们追求的是在最坏的情况下仍然有较好的时间复杂度，
 *      这就是平衡查找树设计的初衷。
 * 平衡二叉树：
 *  又被称为AVL树（有别于AVL算法），且具有以下性质：
 *  它是一 棵空树或它的左右两个子树的高度差的绝对值不超过1，并且左右两个子树都是一棵平衡二叉树。
 *  平衡二叉树的常用算法有红黑树、AVL树等。在平衡二叉搜索树中，我们可以看到，其高度一般都良好地维持在O(log2n)，
 *      单旋转  左旋 右旋
 *      双旋转
 *
 */
public class binaryTree {

}