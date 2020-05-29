# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class MergeTwoLists:
    def mergeTwoList(self, l1: ListNode, l2: ListNode) -> ListNode:
        head = ListNode(0)
        ptr = head
        while (True):
            if l1 is None and l2 is None:
                break
            elif l1 is None:
                ptr.next = l2
                break
            elif l2 is None:
                ptr.next = l1
                break
            else:
                newNode = ListNode(l1.val)
                newNextNode = ListNode(l2.val)
                ptr.next = newNode
                ptr = ptr.next
                ptr.next = newNextNode
                l1 = l1.next
                l2 = l2.next
                ptr = ptr.next

        return head.next

    def mergeTwoLists(self, l1: ListNode, l2: ListNode) -> ListNode:
        head = ListNode(0)
        ptr = head
        while (True):
            if l1 is None and l2 is None:
                break
            elif l1 is None:
                ptr.next = l2
                break
            elif l2 is None:
                ptr.next = l1
                break
            else:
                smallerval = 0
                if l1.val < l2.val:
                    smallerval = l1.val
                    l1 = l1.next
                else:
                    smallerval = l2.val
                    l2 = l2.next
                newNode = ListNode(smallerval)
                ptr.next = newNode
                ptr = ptr.next
        return head.next

    def display_list(self, l: ListNode):
        while l is not None:
            print(l.val)
            l = l.next


if __name__ == "__main__":
    l1 = ListNode()
    l2 = ListNode()
    l1.val = 10
    l2.val = 50
    l1.next = l2

    l11 = ListNode()
    l21 = ListNode()
    l11.val = 15
    l21.val = 25
    l11.next = l21
    merge = MergeTwoLists()
    # new_result = merge.mergeTwoLists(l1, l11)
    # print('Sorted Merge')
    # merge.display_list(new_result)
    new_result = merge.mergeTwoList(l1, l11)
    print('Normal Merge')
    merge.display_list(new_result)
