class Node(object):
  def __init__(self, data=None, next_node=None):
    self.data = data
    self.next = next_node

def Insert(head, data):
  if head is None:
    node = Node(data, None)
    return node
  else:
    firsthead = head
    while head is not None:
      prevhead = head
      head = head.next
      prevhead.next = Node(data, None)
      return firsthead

head = Node(2)
print Insert(head, 4).data