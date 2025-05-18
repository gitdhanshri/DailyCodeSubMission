class Node:
	def __init__(self,val):
		self.data=val
		self.left=None
		self.right=None
root=Node(1)
root.left=Node(2)
root.right=Node(3)
root.left.left=Node(7)
root.left.right=Node(6)
root.right.left=Node(5)
root.right.right=Node(4)
def printTree(root):
	q=[root]
	while(q!=[]):
		node=q.pop(0)
		print(node.data,end=' ')
		if node.left != None:
			q.append(node.left)
		if node.right!=None:
			q.append(node.right)
			
#printTree(root)	
def printTreeInSpiral(root):
	result=[]
	q=[root]
	bool_val=False
	while q:
		level_size = len(q)
		level = []
		for _ in range(level_size):
			node = q.pop(0)
			level.append(node.data)
			if node.left:
				q.append(node.left)
			if node.right:
				q.append(node.right)
		if bool_val==False:
			result.extend(level[::-1])
			bool_val=True
		else:
			result.extend(level)
def spiralPrint(root):
	result=[]
	q=[root]
	bool_val=False
	while q:
		level_size = len(q)
		level = []
		for _ in range(level_size):
			node = q.pop(0)
			level.append(node.data)
			if node.left:
				q.append(node.left)
			if node.right:
				q.append(node.right)
		if bool_val==False:
			result.append(level[::-1])
			bool_val=True
		else:
			result.append(level)
			bool_val=False
	print(result)
spiralPrint(root)
	
