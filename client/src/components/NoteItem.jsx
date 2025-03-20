import React, {useState} from 'react'
import EditNoteForm from './EditNoteForm'
import '../styles/NoteItem.scss'


const NoteItem = ({ note, onDelete }) => {
	  const [isEditing, setIsEditing] = useState(false)

		const handleUpdate = () => {
			setIsEditing(false)
		}

  return (
    <div className="note-item">
      {isEditing ? (
        <EditNoteForm note={note} onUpdate={handleUpdate} onCancel={() => setIsEditing(false)} />
      ) : (
        <>
          <h3>{note.title}</h3>
          <p>{note.content}</p>
          <small>{new Date(note.createdAt).toLocaleDateString()}</small>
          <button onClick={() => setIsEditing(true)}>Редактировать</button>
          <button onClick={() => onDelete(note.id)}>Удалить</button>
        </>
      )}
    </div>
  );
};


export default NoteItem
