The Programmer of the edit menu code in a text-editor GUI might at first, implement the cut and paste operations by copying actual
screen images in and out of an external buffer. Later, he/she may be dissatisfied with this implementation, since it does not allow
compact storage of the selection, and it does not distinguish text and graphic objects. If the programmer  has designed the
cut-and-paste interface with encapsulation in mind, switching the underlying implementation to one that stores text as text and
graphic objects in an appropriate compact format should not cause any problems to functions that need to interface with this GUI.
Thus encapsulation yields adaptability, for it allows the implementation details of parts of a program to change without
adversely affecting other parts.