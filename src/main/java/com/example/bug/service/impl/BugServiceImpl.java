// package com.example.bug.service.impl;



// import java.time.Instant;
// import java.util.Optional;
// import java.util.List;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.stereotype.Service;

// import com.google.gson.Gson;
// import com.example.bug.common.ResponseModel;

// import com.example.bug.model.Bug;
// import com.example.bug.repository.PostRepository;
// import com.example.bug.service.IBugService;

// import jakarta.validation.Valid;
// import lombok.extern.slf4j.Slf4j;

// import java.util.Date;
// import java.util.HashMap;
// import java.util.Map;


// @Service
// @Slf4j
// public class BugServiceImpl implements IBugService {

//     @Autowired
//     Gson gson = new Gson();

//     @Autowired
//     PostRepository repository;

//     @Override
//     public ResponseModel createBug(BugModel model) {

//         ResponseModel responseObj = null;

//         BugModel saveModel = BugModel.builder()
//                 .title(model.getTitle())
//                 .description(model.getDescription())
//                 .status(model.getStatus())
//                 .priority(model.getPriority())
//                 .assignedTo(model.getAssignedTo())
//                 .build();

//         repository.save(saveModel);

//         log.info(gson.toJson(saveModel));

//         responseObj = ResponseModel.builder()
//                 .messageEn("Bug Added Successfully")
//                 .messageFr("Bug Added Successfully")
//                 .messageTypeId(1)
//                 .statusCode(HttpStatus.OK)
//                 .build();

//         return responseObj;

//     }

//     @Override
//     public List<BugModel> getAllBugs() {
//         return repository.findAll();
//     }

//     @Override
//     public List<BugModel> getBugsByStatus(String status) {
//         return repository.findByStatus(status);
//     }

//     @Override
//     public List<BugModel> getBugsByPriority(String priority) {
//         return repository.findByPriority(priority);
//     }

//     @Override
//     public List<BugModel> getBugsByAssignedTo(String userId) {
//         return repository.findByAssignedTo(userId);

//     }
    
//     @Override
//     public BugModel getBugById(String id) {
//         return repository.findById(id).orElse(null);
//     }

//     @Override
//     public BugModel updateBug(String id, BugModel bug) {
//         BugModel existingBug = getBugById(id);
//         if (existingBug != null) {
//             bug.setId(existingBug.getId());
//             return repository.save(bug);
//         }
//         return null;
//     }

//     @Override
//     public void deleteBug(String id) {
//         repository.deleteById(id);
//     }

//     @Override
//     public void assignBug(String bugId, String userId) {
//         BugModel bug = getBugById(bugId);
//         if (bug != null) {
//             bug.setAssignedTo(userId);
//             repository.save(bug);
//         }
//     }

//     @Override
//     public BugModel updateBugStatus(String id, String status) {
//         BugModel bug = getBugById(id);
//         if (bug != null) {
//             bug.setStatus(status);
//             return repository.save(bug);
//         }
//         return null;
//     }
// }